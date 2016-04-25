import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  // @Test
  // public void rootTest() {
  //   goTo("http://localhost:4567/");
  //   assertThat(pageSource()).contains("Side 1");
  // }
  // @Test
  // public void notATriangleTest() {
  //   goTo("http://localhost:4567/");
  //   fill("#inputOne").with("3");
  //   fill("#inputTwo").with("3");
  //   fill("#inputThree").with("7");
  //   submit(".button");
  //   assertThat(pageSource()).contains("Not a triangle");
  // }
}
