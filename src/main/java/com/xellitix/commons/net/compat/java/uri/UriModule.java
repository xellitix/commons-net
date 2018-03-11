package com.xellitix.commons.net.compat.java.uri;

import com.google.inject.AbstractModule;
import java.net.URI;

/**
 * {@link URI} Google Guice module.
 *
 * @author Grayson Kuhns
 */
public class UriModule extends AbstractModule {

  /**
   * Configures the module.
   */
  @Override
  protected void configure() {
    bind(UriFactory.class).to(DefaultUriFactory.class);
  }
}
