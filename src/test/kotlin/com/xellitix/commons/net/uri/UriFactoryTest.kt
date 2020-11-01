package com.xellitix.commons.net.uri

import assertk.assertThat
import assertk.assertions.isEqualTo
import assertk.assertions.isNotNull
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith
import java.net.URISyntaxException
import kotlin.test.assertFailsWith

@RunWith(JUnitPlatform::class)
object UriFactoryTest : Spek({

    // Constants
    val URI_VALID = "https://foo.bar:8080/page.php?id=5"
    val URI_INVALID = "a7sd9d89a98 s7d987sd"

    // Fixtures
    val uriFactory = UriFactory()

    describe("Creating a URI") {
        describe("When the input is valid") {
            it("Creates the URI") {
                val uri = uriFactory.create(URI_VALID)
                assertThat(uri.toASCIIString()).isEqualTo(URI_VALID)
            }
        }

        describe("When the input is invalid") {
            it("Throws exception") {
                val ex = assertFailsWith<UriSyntaxException> {
                    uriFactory.create(URI_INVALID)
                }

                assertThat(ex.cause).isNotNull()
                assertThat(ex.cause!!::class).isEqualTo(URISyntaxException::class)
                assertThat(ex.message).isEqualTo(
                    "Illegal character in path at index 11: a7sd9d89a98 s7d987sd")
            }
        }
    }
})
