package edu.bsuir.test;

import edu.bsuir.driver.WebDriverSingleton;
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

    @Before
    public void login() throws Exception {
        lp.goToMainPage();
        lp.typeLogin("kabanov@tc.by");
        lp.typePassword("welcome");
        lp.clickLoginButton();
        lp.driverWait(30);
        Assert.assertEquals(GeneralReference.MAIN_PAGE, lp.getCurrentUr1());
    }

    @Test
    public void search() {
        cp.goToCandidatesPage();
        cp.searchInput("Максим");
    }

    @Test
    public void filterTest() throws Exception {
        cp.goToCandidatesPage();
        cp.driverWait(30);
        cp.setExperience("36");
        cp.clickStatusNew();
        cp.driverWait(20);
        cp.clickStatusOnApprovalForTheVacancy();
        cp.driverWait(20);
        cp.clickStatusAvailableForApproval();
        cp.driverWait(20);
        cp.clickStatusHired();
        cp.driverWait(30);
        cp.clickChoiceVacancy();
        cp.driverWait(30);
        cp.clickVacancyDesigner();
        cp.driverWait(30);
        cp.clickRelocationUnavailable();
        cp.driverWait(30);
        cp.clickEducationList();
        cp.driverWait(30);
        cp.clickHigherEducation();
        cp.driverWait(30);
        cp.clickUnivercitiesList();
        cp.driverWait(30);
        cp.clickBSU();
        cp.driverWait(30);
        cp.clickCompetenceList();
        cp.driverWait(30);
        cp.clickMCAccess();
        cp.driverWait(30);
    }

    @Test
    public void isCandidatesPageTest() throws Exception {
        cp.goToCandidatesPage();
        cp.driverWait(20);
        Assert.assertEquals(GeneralReference.CANDIDATES_PAGE, cp.getCurrentUr1());
    }

    @Test
    public void clickCreateProfileBtn() {
        cp.clickCreateProfileButton();
        Assert.assertEquals(GeneralReference.CREATE_RESUME_PAGE,cp.getCurrentUr1());
    }

    @After
    public void closeTest() {
        WebDriverSingleton.destroyInstance();
    }
}
