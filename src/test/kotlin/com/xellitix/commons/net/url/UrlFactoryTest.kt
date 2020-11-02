package com.xellitix.commons.net.url

import assertk.assertThat
import assertk.assertions.isEqualTo
import assertk.assertions.isNotNull
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith
import java.net.MalformedURLException
import kotlin.test.assertFailsWith

@RunWith(JUnitPlatform::class)
object UrlFactoryTest : Spek({

    // Constants
    val URL_VALID = "https://foo.bar:8080/page.php?id=5"
    val URL_INVALID = "a7sd9d89a98s7d987sd"

    // Fixtures
    val urlFactory = UrlFactory()

    describe("Creating a URL") {
        describe("When the input is valid") {
            it("Creates the URL") {
                val url = urlFactory.create(URL_VALID)
                assertThat(url.toString()).isEqualTo(URL_VALID)
            }
        }

        describe("When the input is invalid") {
            it("Throws exception") {
                val ex = assertFailsWith<MalformedUrlException> {
                    urlFactory.create(URL_INVALID)
                }

                assertThat(ex.cause).isNotNull()
                assertThat(ex.cause!!::class).isEqualTo(MalformedURLException::class)
                assertThat(ex.message).isEqualTo(
                    "no protocol: a7sd9d89a98s7d987sd")
            }
        }
    }
})
