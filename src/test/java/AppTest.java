import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
 import java.text.*;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Tell us the weight of the package:");
  }
  @Test
  public void basicCost() {
    goTo("http://localhost:4567/");
    fill("#inputWeight").with("1");
    fill("#inputHeight").with("2");
    fill("#inputWidth").with("2");
    fill("#inputDepth").with("2");
    submit(".button");
    assertThat(pageSource()).contains("18");
  }
  @Test
  public void costWithGiftWrap() {
    goTo("http://localhost:4567/");
    fill("#inputWeight").with("1");
    fill("#inputHeight").with("2");
    fill("#inputWidth").with("2");
    fill("#inputDepth").with("2");
    find("#giftWrap").click();
    submit(".button");
    assertThat(pageSource()).contains("19");
  }
}
