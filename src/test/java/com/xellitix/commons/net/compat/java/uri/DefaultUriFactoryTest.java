package com.xellitix.commons.net.compat.java.uri;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.net.URI;
import java.net.URISyntaxException;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * {@link DefaultUriFactory} test case.
 *
 * @author Grayson Kuhns
 */
public class DefaultUriFactoryTest {

  // Constants
  private static final String URI_VALID = "https://foo.bar:8080/page.php?id=5";
  private static final String URI_MALFORMED = "a7sd9d89a98 s7d987sd";

  // Rules
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  // Fixtures
  private DefaultUriFactory uriFactory = new DefaultUriFactory();

  @Test
  public void uriIsCreated__WhenStringRepresentationIsValid__Test() throws Exception {
    // Create URI
    URI uri = uriFactory.create(URI_VALID);

    // Validate the URI
    assertThat(uri).isNotNull();
    assertThat(uri.toString()).isEqualTo(URI_VALID);
  }

  @Test
  public void exceptionIsThrown__WhenStringRepresentationIsMalformed__Test() throws Exception {
    // Describe the exception to expect
    thrown.expect(URISyntaxException.class);

    // Attempt to create a malformed URI
    uriFactory.create(URI_MALFORMED);
  }
}
