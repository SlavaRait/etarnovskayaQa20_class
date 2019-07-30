package com.telran.qa20.tests;

import org.testng.annotations.Test;

public class EditUserDataTests extends  TestBase {

  
  @Test
  public void addAvatarTest() throws InterruptedException {
    app.getUser().clickOnAvatar();
    app.getUser().enterToProfile();
    app.getUser().changeAvatar();
    //app.getUser().saveChanges();

  }
}
