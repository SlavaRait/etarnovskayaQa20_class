import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
  WebDriver wd;

  @BeforeMethod
  public void setUp() {
    wd = new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    wd.get("https://trello.com");

  }

  @AfterMethod
  public void tearDown() {
    wd.quit();
  }
}
