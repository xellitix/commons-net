package com.xellitix.commons.net.compat.java.url;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;

/**
 * {@link UrlModule} test case.
 *
 * @author Grayson Kuhns
 */
public class UrlModuleTest {

  // Fixtures
  private final Injector injector = Guice.createInjector(new UrlModule());

  @Test
  public void provision__UrlFactory__Test() {
    injector.getInstance(UrlFactory.class);
  }
}
