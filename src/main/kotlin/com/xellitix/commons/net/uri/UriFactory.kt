package com.xellitix.commons.net.uri

import com.google.inject.Singleton
import java.net.URI
import java.net.URISyntaxException

/**
 * [URI] factory.
 */
@Singleton
class UriFactory {

    /**
     * Creates a [URI].
     */
    fun create(uri: String): URI {
        return try {
            URI(uri)
        } catch (ex: URISyntaxException) {
            throw UriSyntaxException(ex)
        }
    }
}
