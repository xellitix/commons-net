package com.xellitix.commons.net.url

import java.net.MalformedURLException

/**
 * Non-checked exception thrown when attempting to construct a malformed URL.
 */
class MalformedUrlException(cause: MalformedURLException) : RuntimeException(cause.message, cause)
