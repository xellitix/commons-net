package com.xellitix.commons.net.url

import dev.misfitlabs.kotlinguice4.KotlinModule

/**
 * [UrlFactory] Guice module.
 */
class UrlFactoryModule : KotlinModule() {

    override fun configure() {
        bind<UrlFactory>()
    }
}
