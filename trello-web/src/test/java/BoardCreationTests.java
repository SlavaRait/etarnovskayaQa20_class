import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardCreationTests  extends TestBase{
  @BeforeMethod
  public void login() throws InterruptedException {
    //click login button
    wd.findElement(By.cssSelector("[href='/login']")).click();
    //type email
    wd.findElement(By.id("user")).sendKeys("elena.telran@yahoo.com");
    //type password
    wd.findElement(By.name("password")).sendKeys("12345.com");
    Thread.sleep(3000);
    //confirmLogin
    wd.findElement(By.id("login")).click();
    Thread.sleep(10000);

  }
  @Test
  public void testBoardCreationFromHeader() throws InterruptedException {
    //clickOnPlusButtonOnHeader
    wd.findElement(By.cssSelector("[name=add]")).click();
//selectCreateBoardFromDropDown
    wd.findElement(By.cssSelector("[data-test-id=header-create-board-button]")).click();
    Thread.sleep(10000);
    //TypeBoardName
    wd.findElement(By.cssSelector("[data-test-id=header-create-board-title-input]")).click();
    wd.findElement(By.cssSelector("[data-test-id=header-create-board-title-input]")).clear();
    wd.findElement(By.cssSelector("[data-test-id=header-create-board-title-input]")).sendKeys("qa20");
  }
}
