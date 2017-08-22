package com.xellitix.commons.net.url;

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
   * @param url The {@link URL} string representation.
   * @return The {@link URL}.
   * @throws MalformedURLException If the {@link URL} is malformed.
   */
  @Override
  public URL create(final String url) throws MalformedURLException {
    return new URL(url);
  }
}
