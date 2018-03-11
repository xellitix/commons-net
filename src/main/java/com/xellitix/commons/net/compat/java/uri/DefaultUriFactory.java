package com.xellitix.commons.net.compat.java.uri;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Default {@link UriFactory} implementation.
 *
 * @author Grayson Kuhns
 */
public class DefaultUriFactory implements UriFactory {

  /**
   * Creates a {@link URI}.
   *
   * @param uri The string representation.
   * @return The {@link URI}.
   * @throws URISyntaxException If the string representation is malformed.
   */
  @Override
  public URI create(final String uri) throws URISyntaxException {
    return new URI(uri);
  }
}
