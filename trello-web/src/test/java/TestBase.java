import org.openqa.selenium.By;
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

  public void pause(int millis) throws InterruptedException {
    Thread.sleep(millis);
  }

  public void confirmLogin() {
    click(By.id("login"));
  }

  public void click(By locator) {
    wd.findElement(locator).click();
  }

  public void fillLoginForm(String email, String password) {
    type(By.id("user"), email);
    type(By.name("password"), password);
  }

  public void type(By locator, String text) {
    click(locator);
    wd.findElement(locator).clear();
    wd.findElement(locator).sendKeys(text);
  }

  public void clickLoginButton() {
    click(By.cssSelector("[href='/login']"));
  }

  public void login(String email, String pwd) throws InterruptedException {
    clickLoginButton();
    fillLoginForm(email, pwd); //"elena.telran@yahoo.com", "12345.com"
    pause(3000);
    confirmLogin();
    pause(10000);
  }

  public  void confirmBoardCreation(){
    click(By.cssSelector("[data-test-id=header-create-board-submit-button]"));
  }

  public void typeBoardName(String boardName) {
    type(By.cssSelector("[data-test-id=header-create-board-title-input]"), boardName);

  }

  public void selectCreateBoardFromDropDown() {
    click(By.cssSelector("[data-test-id=header-create-board-button]"));
  }

  public void clickOnPlusButtonOnHeader() {
    click(By.cssSelector("[name=add]"));
  }
}
