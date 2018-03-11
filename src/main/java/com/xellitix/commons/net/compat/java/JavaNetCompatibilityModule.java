package com.xellitix.commons.net.compat.java;

import com.google.inject.AbstractModule;
import com.xellitix.commons.net.compat.java.uri.UriModule;
import com.xellitix.commons.net.compat.java.url.UrlModule;

/**
 * Networking compatibility Google Guice module.
 *
 * @author Grayson Kuhns
 */
public class JavaNetCompatibilityModule extends AbstractModule {

  /**
   * Configures the module.
   */
  @Override
  protected void configure() {
    install(new UriModule());
    install(new UrlModule());
  }
}
