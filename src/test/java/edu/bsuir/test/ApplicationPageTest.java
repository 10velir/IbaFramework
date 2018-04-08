package edu.bsuir.test;

import edu.bsuir.web.Locators.GeneralReference;
import edu.bsuir.web.pages.ApplicationPage;
import edu.bsuir.web.pages.LoginPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ApplicationPageTest {
    ApplicationPage ap = new ApplicationPage();
    LoginPage lp = new LoginPage();
    @Before
    public void loginTestForFilter() {
        lp.goToMainPage();
        lp.typeLogin("kabanov@tc.by");
        lp.typePassword("welcome");
        lp.clickLoginButton();
        lp.driverWait(30);
        Assert.assertEquals(GeneralReference.MAIN_PAGE, lp.getCurrentUr1());
    }
    @Test
    public void createApplication() {
        ap.goToApplicationCreationPage();
        ap.driverWait(30);
        ap.enterPosition("Layout Designer");
        ap.enterPlannedClosingDate("01.05.2018");
        ap.clickPriorityRadioBtn();
        ap.enterQuantity("20");
        ap.enterCreationReason("Some reason");
        ap.enterSalary("550");
        ap.setCurrency("3");
        ap.setJobType("3");
        ap.enterEmployees("not provide");
        ap.enterBusinessTrip("USA, Every six months");
        ap.enterTimetable("40 hours");
        ap.enterProbationPeriod("one month");
        ap.enterResponsibilities("Relax and do design");
        ap.clickCandidateType();
        ap.setEducation("4");
        ap.enterEducationSpecialization("The students of 3-4 courses of technical specialties");
        ap.selectAllSkills();
        ap.selectBaseSkills();
        ap.chooseTrainability();
        ap.chooseStressResistance();
        ap.selectBaseWebSkills();
        ap.chooseJS();
        ap.chooseCSS3();
        ap.chooseHTML();
        ap.clickConfirmButon();
        ap.enterComment("Good luck & have fun ");
        //ap.clickSaveBtn();
    }
}
