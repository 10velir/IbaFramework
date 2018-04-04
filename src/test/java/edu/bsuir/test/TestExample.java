package edu.bsuir.test;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.web.LoginPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class TestExample {

    public WebDriver driver = WebDriverSingleton.getInstance();

    LoginPage lp = new LoginPage();
    @Before
    public void login() {
        lp.enterLoginPage();
        lp.typeLogin("kabanov@tc.by");
        lp.typePassword("welcome");
        lp.clickLoginButton();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        Assert.assertEquals("Александр Евгеньевич Кабанов",lp.getFloatBoxTitle());
    }

  /*  @Test
    public void toApplications() {
        lp.enterLoginPage();
        lp.enterLoginPage2();
        Assert.assertEquals("Подбор и адаптация - Конструктор Талантов", lp.getTitle());
    }
*/
    @Test
    public void createApplication() {
        lp.enterLoginPage();
        lp.driverWait(30);
        lp.enterLoginPage1();
        lp.driverWait(30);
        lp.enterLoginPage2();
        lp.driverWait(30);
        lp.enterPosition("Layout Designer");
        lp.enterPlannedClosingDate("01.05.2018");
        lp.clickPriorityRadioBtn();
        lp.enterQuantity("20");
        lp.enterCreationReason("Some reason");
        lp.enterSalary("550");
        lp.setCurrency("3");
        lp.setJobType("3");
        lp.enterEmployees("not provide");
        lp.enterBusinessTrip("USA, Every six months");
        lp.enterTimetable("40 hours");
        lp.enterProbationPeriod("one month");
        lp.enterResponsibilities("Relax and do design");
        lp.clickCandidateType();
        lp.setEducation("4");
        lp.enterEducationSpecialization("The students of 3-4 courses of technical specialties");
        lp.selectAllSkills();
        lp.selectBaseSkills();
        lp.chooseTrainability();
        lp.chooseStressResistance();
        lp.selectBaseWebSkills();
        lp.chooseJS();
        lp.chooseCSS3();
        lp.chooseHTML();
        lp.clickConfirmButon();
        lp.enterComment("Good luck & have fun ");
        lp.clickSaveBtn();
    }
}
