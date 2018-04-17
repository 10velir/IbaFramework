package edu.bsuir.test.fileUploadGroupTests;

import edu.bsuir.util.helper.Helper;
import edu.bsuir.web.Locators.CreateResumeElements;
import edu.bsuir.web.pages.CreateResumePage;
import edu.bsuir.web.pages.LoginPage;

import org.junit.Assert;
import org.junit.Test;



public class UploadFileUsingSeleniumTest {
    private CreateResumePage crp = new CreateResumePage();
    private LoginPage lp = new LoginPage();

    @Test
    public void uploadFileUsingSelenium() {
        lp.goToMainPage();
        lp.typeLogin("kabanov@tc.by").typePassword("welcome").clickLoginButton();
        Helper.waitForTime(10);
        crp.goToCreateResumePage();
        Helper.waitForTime(20);
        crp.sendPathToImage(
                crp.getAbsolutePath(CreateResumeElements.PATH_TO_IMAGE)
        );

        Assert.assertNotEquals(crp.getPictureAttribute("src"), CreateResumeElements.noAvatar);
    }

}
