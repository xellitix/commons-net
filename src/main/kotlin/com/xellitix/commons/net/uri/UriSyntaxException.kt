package com.xellitix.commons.net.uri

import java.net.URISyntaxException

/**
 * Non-checked exception thrown when attempting to construct a malformed URI.
 */
class UriSyntaxException(cause: URISyntaxException) : RuntimeException(cause.message, cause)
