package edu.bsuir.web.pages;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.element.Element;
import edu.bsuir.web.Locators.CandidatesPageElements;
import edu.bsuir.web.Locators.GeneralReference;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class CandidatesPage {
    WebDriver driver = WebDriverSingleton.getInstance();

    public void setExperience(String num) {
        WebElement element = driver.findElement(CandidatesPageElements.EXPERIENCE);
        Select select = new Select(element);
        select.selectByValue(num);
    }

    public void clickStatusNew(){
        WebElement element = driver.findElement(CandidatesPageElements.STATUS_NEW);
        element.click();
    }
    public void driverWait(int sec) {
        driver.manage().timeouts().pageLoadTimeout(sec, TimeUnit.SECONDS);
    }
    public void clickStatusOnApprovalForTheVacancy(){
        Element element1 = new Element("OnApprovalForVacancy", CandidatesPageElements.STATUS_ON_APPROVAL_FOR_THE_VACANCY);
        element1.clickElement();
        /*WebElement element = driver.findElement(CandidatesPageElements.STATUS_ON_APPROVAL_FOR_THE_VACANCY);
        element.click();*/
    }

    public void clickStatusAvailableForApproval(){
        WebElement element = driver.findElement(CandidatesPageElements.STATUS_AVAILABLE_FOR_APPROVAL);
        element.click();
    }

    public void clickStatusHired(){
        Element element = new Element("StatusHired",CandidatesPageElements.STATUS_HIRED);
        element.clickElement();
       /* WebElement element = driver.findElement(CandidatesPageElements.STATUS_HIRED);
        element.click();*/
    }

    public void clickChoiceVacancy(){
        Element element = new Element("VacancyChoice",CandidatesPageElements.CHOICE_VACANCY);
        element.clickElement();
        /*WebElement element = driver.findElement(CandidatesPageElements.CHOICE_VACANCY);
        element.click();*/
    }

    public void searchInput(String searchInputWord){
        WebElement element = driver.findElement(CandidatesPageElements.SEARCH_INPUT);
        element.clear();
        element.sendKeys(searchInputWord);
    }

    public void clickVacancyDesigner(){
        WebElement element = driver.findElement(CandidatesPageElements.VACANCY_DESIGNER);
        element.click();
    }

    public void clickRelocationAvailable(){
        WebElement element = driver.findElement(CandidatesPageElements.RELOCATION_AVAILABLE);
        element.click();
    }

    public void clickRelocationUnavailable(){
        WebElement element = driver.findElement(CandidatesPageElements.RELOCATION_UNAVAILABLE);
        element.click();
    }

    public void clickEducationList(){
        Element element = new Element("EDUCATION_LIST",CandidatesPageElements.EDUCATION_LIST);
        element.clickElement();
        /*WebElement element = driver.findElement(CandidatesPageElements.EDUCATION_LIST);
        element.click();*/
    }

    public void clickEducationNotIndicated(){
        WebElement element = driver.findElement(CandidatesPageElements.EDUCATION_NOT_INDICATED);
        element.click();
    }

    public void clickGeneralSecondaryEducation(){
        WebElement element = driver.findElement(CandidatesPageElements.GENERAL_SECONDARY_EDUCATION);
        element.click();
    }

    public void clickProfessionalTechnical(){
        WebElement element = driver.findElement(CandidatesPageElements.PROFESSIONAL_TECHNICAL);
        element.click();
    }

    public void clickSecondarySpecial(){
        WebElement element = driver.findElement(CandidatesPageElements.SECONDARY_SPECIAL_EDUCATION);
        element.click();
    }

    public void clickHigherEducation(){
        Element element = new Element("HIGHER_EDUCATION",CandidatesPageElements.HIGHER_EDUCATION);
        element.clickElement();
       /* WebElement element = driver.findElement(CandidatesPageElements.HIGHER_EDUCATION);
        element.click();*/
    }

    public void clickNongraduatedHigherEducation(){
        WebElement element = driver.findElement(CandidatesPageElements.NONGRADUATED_HIGHER_EDUCATION);
        element.click();
    }

    public void clickUnivercitiesList(){
        Element element = new Element("UNIVERCITIES_LIST",CandidatesPageElements.UNIVERCITIES_LIST);
        element.clickElement();
        /*WebElement element = driver.findElement(CandidatesPageElements.UNIVERCITIES_LIST);
        element.click();*/
    }

    public void clickBSU(){
        Element element = new Element("BSU",CandidatesPageElements.BSU);
        element.clickElement();
      /*  WebElement element = driver.findElement(CandidatesPageElements.BSU);
        element.click();*/
    }

    public void clickBSUIR(){
        WebElement element = driver.findElement(CandidatesPageElements.BSUIR);
        element.click();
    }

    public void clickBSEU(){
        WebElement element = driver.findElement(CandidatesPageElements.BSEU);
        element.click();
    }

    public void clickBSTU(){
        WebElement element = driver.findElement(CandidatesPageElements.BSTU);
        element.click();
    }

    public void clickCompetenceList(){
        Element element = new Element("COMPETENCE_LIST",CandidatesPageElements.COMPETENCE_LIST);
        element.clickElement();
        /*WebElement element = driver.findElement(CandidatesPageElements.COMPETENCE_LIST);
        element.click();*/
    }

    public void clickMCAccess(){
        Element element = new Element("COMPETENCE_LIST",CandidatesPageElements.MC_ACCESS);
        element.clickElement();
        /*WebElement element = driver.findElement(CandidatesPageElements.MC_ACCESS);
        element.click();*/
    }

    public void clickEnglish(){
        WebElement element = driver.findElement(CandidatesPageElements.ENGLISH);
        element.click();
    }

    public void clickClearFilter(){
        WebElement element = driver.findElement(CandidatesPageElements.CLEAR_FILTER);
        element.click();
    }

    public void clickCreateProfileButton(){
        Element element = new Element("createProfileButton",CandidatesPageElements.CREATE_PROFILE_BUTTON);
        element.clickElement();
    }


    public void goToMainPage(){
        driver.get(GeneralReference.MAIN_PAGE);
    }
    public void goToApplicationCreationPage(){
        driver.get(GeneralReference.APPLICATION_CREATION_PAGE);
    }
    public void goToRecruitingPage(){
        driver.get(GeneralReference.RECRUITING_PAGE);
    }
    public void goToCandidatesPage() {
        driver.get(GeneralReference.CANDIDATES_PAGE);
    }
    public String getCurrentUr1() {
        return driver.getCurrentUrl();
    }
}
