package com.telran.qa20.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TrelloLoginTest  extends  TestBase{

  @Test(enabled = false)
  public void loginTest() throws InterruptedException {
    app.getSession().clickLoginButton();
    app.getSession().fillLoginForm("slavarait@gmail.com", "sr232323");
    app.getSession().pause(3000);
    app.getSession().confirmLogin();
    app.getSession().pause(10000);





  }

}
