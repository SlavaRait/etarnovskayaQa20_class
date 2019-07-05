import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardCreationTests  extends TestBase{
  @BeforeMethod
  public void ensurePreconditions() throws InterruptedException {
    login("elena.telran@yahoo.com", "12345.com");
  }
  @Test
  public void testBoardCreationFromHeader() throws InterruptedException {
    clickOnPlusButtonOnHeader();
    selectCreateBoardFromDropDown();
    pause(10000);
    typeBoardName("qa20" + System.currentTimeMillis());
    confirmBoardCreation();
  }

}
