package com.xellitix.commons.net.compat.url;

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
   * @param url The string representation.
   * @return The {@link URL}.
   * @throws MalformedURLException If the string representation is malformed.
   */
  URL create(String url) throws MalformedURLException;
}
