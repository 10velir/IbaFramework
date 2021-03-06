package edu.bsuir.test.fileUploadGroupTests;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.util.helper.Helper;
import edu.bsuir.web.pages.CreateResumePage;
import edu.bsuir.web.pages.LoginPage;
import org.junit.After;
import org.junit.Test;

public class UploadFileUsingSikuliTest {

    CreateResumePage crp = new CreateResumePage();
    LoginPage lp = new LoginPage();
    private Helper hl = new Helper();

    @Test
    public void uploadFileUsingSikuli() throws Exception {
        lp.goToMainPage();
        lp.typeLogin("kabanov@tc.by").typePassword("welcome").clickLoginButton();
        Helper.waitForTime(10);
        crp.goToCreateResumePage();
        Helper.waitForTime(20);

        crp.clickChangeImgLink();
        //crp.getScreen().wait() :(
    }

    @After
    public void closeTest() {
        hl.closeBrowser();
    }
}
