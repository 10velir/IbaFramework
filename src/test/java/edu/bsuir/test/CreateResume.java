package edu.bsuir.test;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.util.helper.Helper;
import edu.bsuir.web.Locators.GeneralReference;
import edu.bsuir.web.pages.CandidatesPage;
import edu.bsuir.web.pages.CreateResumePage;
import edu.bsuir.web.pages.LoginPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CreateResume {
    CreateResumePage cr = new CreateResumePage();
    LoginPage lp = new LoginPage();
    CandidatesPage cp = new CandidatesPage();
    private Helper hl = new Helper();

    @Before
    public void loginTestForFilter() throws Exception {
        lp.goToMainPage();
        lp.typeLogin("kabanov@tc.by");
        lp.typePassword("welcome");
        lp.clickLoginButton();
        lp.driverWait(40);
        Assert.assertEquals(GeneralReference.MAIN_PAGE, lp.getCurrentUr1());
    }

    @Test
    public void createResumeTest() {
        cr.goToCreateResumePage();
       //тут должно быть поменять изображение, но это я хз как
        cr.setSurname("Сизов");
        cr.setName("Родион");
        cr.setSecondName("Юрьевич");
        cr.setPrimaryTelephone("80298246866");
        cr.clickAddTelephoneButton();
        cr.clickRemoveTelephoneButton();
        cr.setPrimaryEmail("radik97@mail.ru");
        cr.clickAddEmailButton();
        cr.clickRemoveEmailButton();
        cr.setSkype("hmelnov_lover97");
        cr.setCountry("Беларусь");
        cr.setAddress("г.Минск, ул. Якуба Коласа 28, 321б");
        cr.clickRelocation();
        cr.setDateOfBirthDay("25");
        cr.setDateOfBirthMonth("10");
        cr.setDateOfBirthYear("1997");
        cr.setEducation("4");
        cr.setDesiredPosition("C++ developer");

        //cr.clickEditCompetenciesBtn();

        cr.clickTabEducation();
        cr.clickAddInformation1();
        cr.setUniversity("BSUIR");
        cr.setFaculty("FCD");
        cr.setSpecialization("Computer design and programming");
        cr.setStartYear("2015");
        cr.setEndYear("2019");
        //можно удалить информацию (метод есть в локаторах)

        cr.clickTabWorkExperience();
        cr.clickAddInformation2();
        cr.setPosition("Управляющий по археологическим базам данных");
        cr.setCompany("Комплекс Брестская Крепость");
        cr.setStartWorkMonth("Ноябрь");
        cr.setStartWorkYear("2015");
        cr.clickWorkTillNow(); //можно вместо этого метода написать месяц и год окончания работы (они есть в локаторвх)
        cr.setDescription("Проявил себя как хороший специалист");
        //можно удалить информацию (метод есть в локаторах)

        cr.clickTabMotivation();
        cr.setMaterialInterest("3");
        cr.setStabilityAndSecurity("4");
        cr.setWorkingConditions("5");
        cr.setSocialStatus("3");
        cr.setInterpersonalRelationships("4");
        cr.setDegreeOfWorkControl("4");
        cr.setCareerGrowth("5");
        cr.setAvailabilityOfHighAccountability("3");
        cr.setCreativity("4");
        cr.setRecognition("5");
        cr.setTrainingAndDevelopment("4");
        cr.setAchievementOfResuts("4");

        cr.clickTabReferences();
        cr.clickAddInformation3();
        cr.setRecName("Роман Стасюкевич");
        cr.setRecPosition("Директор комплекса Бресткая Крепость");
        cr.setRecCompany("Комплекс Бресткая Крепость");
        cr.setRecTelephone("80297260238");
        //можно удалить информацию (метод есть в локаторах)
        //добавь ещё загрузить, сохранить и отмена
    }

    @After
    public void closeTest() {
        hl.closeBrowser();
    }
}

