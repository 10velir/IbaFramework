package edu.bsuir.test.fileUploadGroupTests;

import edu.bsuir.util.helper.Helper;
import edu.bsuir.web.Locators.CreateResumeElements;
import edu.bsuir.web.pages.CreateResumePage;
import edu.bsuir.web.pages.LoginPage;
import org.junit.Assert;
import org.junit.Test;

public class UploadFileUsingRobotTest {
    CreateResumePage crp = new CreateResumePage();
    LoginPage lp = new LoginPage();

    @Test
    public void uploadFileUsingRobot() {
        lp.goToMainPage();
        lp.typePassword("welcome").typeLogin("kabanov@tc.by").clickLoginButton();
        crp.goToCreateResumePage();
        Helper.waitForTime(10);

        crp.clickPlusAttachment();
        Helper.waitForTime(10);
        crp.sendFile(CreateResumeElements.PATH_TO_IMAGE);

        Assert.assertTrue(crp.isElementPresent(CreateResumeElements.REMUVE_ATTACHMENT));
    }
}