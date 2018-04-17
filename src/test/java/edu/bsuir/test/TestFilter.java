package edu.bsuir.test;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.util.helper.Helper;
import edu.bsuir.web.Locators.GeneralReference;
import edu.bsuir.web.pages.CandidatesPage;
import edu.bsuir.web.pages.LoginPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestFilter {
    CandidatesPage cp = new CandidatesPage();
    LoginPage lp = new LoginPage();
    private String nameForSearchCandidate = "Р•РІРіРµРЅРёСЏ";

    @Before
    public void login() throws Exception {
        lp.goToMainPage();
        lp.typeLogin("kabanov@tc.by");
        lp.typePassword("welcome");
        lp.clickLoginButton();
        lp.driverWait(30);
        Assert.assertEquals(GeneralReference.MAIN_PAGE, lp.getCurrentUr1());
        //lp.addShutdownHook();
    }

    @Test
    public void search() {
        cp.goToCandidatesPage();
        cp.searchInput(nameForSearchCandidate);
        Helper.waitForTime(3);
        cp.goToProfileOfCandidate();

    }

    @Test
    public void setExperienceTest() {
        cp.goToCandidatesPage();
        Helper.waitForTime(3);
        cp.getDropDownMenuByNumber(3);
        cp.setExperience("36");
    }

    @Test
    public void setAllStatuses() {
        cp.goToCandidatesPage();
        Helper.waitForTime(3);
        cp.clickStatusNew();
        Helper.waitForTime(3);
        cp.clickStatusOnApprovalForTheVacancy();
        Helper.waitForTime(3);
        cp.clickStatusAvailableForApproval();
        Helper.waitForTime(3);
        cp.clickStatusHired();
    }

    @Test
    public void clickRelocationUnavailable() {
        cp.goToCandidatesPage();
        cp.clickRelocationUnavailable();
    }

    @Test
    public void clickRelocationAvailable() {
        cp.goToCandidatesPage();
        cp.clickRelocationAvailable();
    }

    @Test
    public void choiceAgileDeveloperVacancy() {
        cp.goToCandidatesPage();
        cp.clickChoiceVacancy();
        Helper.waitForTime(3);
        cp.clickAgileDeveloper();
        Helper.waitForTime(3);
        cp.closeOpenedButton();
    }

    @Test
    public void choiceHigherEducation() {
        cp.goToCandidatesPage();
        cp.clickEducationList();
        Helper.waitForTime(3);
        cp.clickHigherEducation();
        Helper.waitForTime(3);
        cp.closeOpenedButton();
    }

    @Test
    public void choiceBSU() {
        cp.goToCandidatesPage();
        cp.clickUnivercitiesList();
        Helper.waitForTime(3);
        cp.clickBSU();
        Helper.waitForTime(3);
        cp.closeOpenedButton();
    }

    @Test
    public void choiceStrategicThinking() {
        cp.goToCandidatesPage();
        cp.clickCompetenceList();
        Helper.waitForTime(3);
        cp.clickStrategicThinking();
        Helper.waitForTime(3);
        cp.closeOpenedButton();
    }


    @Test
    public void isCandidatesPageTest() {
        cp.goToCandidatesPage();
        cp.driverWait(20);
        Assert.assertEquals(GeneralReference.CANDIDATES_PAGE, cp.getCurrentUr1());
    }

    @Test
    public void clickCreateProfileBtn() {
        cp.goToCandidatesPage();
        cp.driverWait(20);
        cp.clickCreateProfileButton();
        Assert.assertEquals(GeneralReference.CREATE_RESUME_PAGE, cp.getCurrentUr1());
    }

    @After
    public void closeTest() {
        cp.closeDriver();
        WebDriverSingleton.destroyInstance();
    }
}
