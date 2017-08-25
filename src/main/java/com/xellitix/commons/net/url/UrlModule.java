package com.xellitix.commons.net.url;

import com.google.inject.AbstractModule;
import java.net.URL;

/**
 * {@link URL} Google Guice module.
 *
 * @author Grayson Kuhns
 */
public class UrlModule extends AbstractModule {

  /**
   * Configures the module.
   */
  @Override
  protected void configure() {
    bind(UrlFactory.class).to(DefaultUrlFactory.class);
  }
}
