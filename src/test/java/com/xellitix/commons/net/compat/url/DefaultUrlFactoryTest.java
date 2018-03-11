package com.xellitix.commons.net.compat.url;

import static org.assertj.core.api.Assertions.assertThat;

import java.net.MalformedURLException;
import java.net.URL;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * {@link DefaultUrlFactory} test case.
 *
 * @author Grayson Kuhns
 */
public class DefaultUrlFactoryTest {

  // Constants
  private static final String URL_VALID = "https://foo.bar:8080/page.php?id=5";
  private static final String URL_MALFORMED = "a7sd9d89a98s7d987sd";

  // Rules
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  // Fixtures
  private DefaultUrlFactory urlFactory = new DefaultUrlFactory();

  @Test
  public void urlIsCreated__WhenStringRepresentationIsValid__Test() throws Exception {
    // Create URL
    URL url = urlFactory.create(URL_VALID);

    // Validate URL
    assertThat(url).isNotNull();
    assertThat(url.toString()).isEqualTo(URL_VALID);
  }

  @Test
  public void exceptionIsThrown__WhenStringRepresentationIsMalformed__Test() throws Exception {
    // Describe the exception to expect
    thrown.expect(MalformedURLException.class);

    // Attempt to create an invalid URL
    urlFactory.create(URL_MALFORMED);
  }
}
