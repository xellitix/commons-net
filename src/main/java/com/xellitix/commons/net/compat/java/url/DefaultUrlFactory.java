package com.xellitix.commons.net.compat.java.url;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Default {@link UrlFactory} implementation.
 *
 * @author Grayson Kuhns
 */
public class DefaultUrlFactory implements UrlFactory {

  /**
   * Creates a {@link URL}.
   *
   * @param url The string representation.
   * @return The {@link URL}.
   * @throws MalformedURLException If the string representation is malformed.
   */
  @Override
  public URL create(final String url) throws MalformedURLException {
    return new URL(url);
  }
}
