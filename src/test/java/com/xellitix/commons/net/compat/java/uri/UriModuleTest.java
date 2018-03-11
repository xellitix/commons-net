package com.xellitix.commons.net.compat.java.uri;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;

public class UriModuleTest {

  // Fixtures
  private final Injector injector = Guice.createInjector(new UriModule());

  @Test
  public void provision__UriFactory__Test() {
    injector.getInstance(UriFactory.class);
  }
}
