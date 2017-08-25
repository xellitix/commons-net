package com.xellitix.commons.net.url;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * {@link URL} factory.
 *
 * @author Grayson Kuhns
 */
public interface UrlFactory {

  /**
   * Creates a {@link URL}.
   *
   * @param url The {@link URL} string representation.
   * @return The {@link URL}.
   * @throws MalformedURLException If the {@link URL} is malformed.
   */
  URL create(String url) throws MalformedURLException;
}
