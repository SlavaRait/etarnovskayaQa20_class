import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TrelloLoginTest  extends  TestBase{

  @Test
  public void loginTest() throws InterruptedException {
    clickLoginButton();
    fillLoginForm("elena.telran@yahoo.com", "12345.com");
    pause(3000);
    confirmLogin();
    pause(10000);

  }

}
