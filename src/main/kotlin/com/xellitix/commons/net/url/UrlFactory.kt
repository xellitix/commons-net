package com.xellitix.commons.net.url

import com.google.inject.Singleton
import java.net.MalformedURLException
import java.net.URL

/**
 * [URL] factory.
 */
@Singleton
class UrlFactory {

    /**
     * Creates a [URL].
     */
    fun create(url: String): URL {
        return try {
            URL(url)
        } catch (ex: MalformedURLException) {
            throw MalformedUrlException(ex)
        }
    }
}
