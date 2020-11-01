package com.xellitix.commons.net.uri

import dev.misfitlabs.kotlinguice4.KotlinModule

/**
 * [UriFactory] Guice module.
 */
class UriFactoryModule : KotlinModule() {

    override fun configure() {
        bind<UriFactory>()
    }
}
