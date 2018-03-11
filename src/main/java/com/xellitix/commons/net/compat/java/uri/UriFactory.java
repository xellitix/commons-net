package com.xellitix.commons.net.compat.java.uri;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * {@link URI} factory.
 *
 * @author Grayson Kuhns
 */
public interface UriFactory {

  /**
   * Creates a {@link URI}.
   *
   * @param uri The string representation.
   * @return The {@link URI}.
   * @throws URISyntaxException If the string representation is malformed.
   */
  URI create(String uri) throws URISyntaxException;
}
