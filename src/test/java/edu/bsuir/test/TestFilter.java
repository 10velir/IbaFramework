package edu.bsuir.test;

import edu.bsuir.web.Locators.GeneralReference;
import edu.bsuir.web.pages.CandidatesPage;
import edu.bsuir.web.pages.LoginPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestFilter {
    CandidatesPage cp = new CandidatesPage();
    LoginPage lp = new LoginPage();

    @Test
    public void filterTest() throws Exception {
        cp.goToCandidatesPage();
        cp.clickStatusNew();
        cp.driverWait(20);
        cp.clickStatusOnApprovalForTheVacancy();
        cp.driverWait(20);
        cp.clickStatusAvailableForApproval();
        cp.driverWait(20);
        cp.clickStatusHired();
        cp.clickChoiceVacancy();
        cp.clickVacancyDesigner();
        cp.clickRelocationUnavailable();
        cp.clickEducationList();
        cp.clickHigherEducation();
        cp.clickUnivercitiesList();
        cp.clickBSU();
        cp.clickCompetenceList();
        cp.clickMCAccess();
    }

    @Test
    public void isCandidatesPageTest() throws Exception{
        cp.goToMainPage();
        cp.goToCandidatesPage();
        cp.driverWait(20);
        Assert.assertEquals(GeneralReference.CANDIDATES_PAGE, cp.getCurrentUr1());
        System.out.println(GeneralReference.CANDIDATES_PAGE );
        System.out.println(cp.getCurrentUr1());
    }

    @Before
    public void loginTestForFilter() throws Exception {
        lp.goToMainPage();
        lp.typeLogin("kabanov@tc.by");
        lp.typePassword("welcome");
        lp.clickLoginButton();
        lp.driverWait(30);
        Assert.assertEquals("Александр Евгеньевич Кабанов", lp.getFloatBoxTitle());
    }
}
