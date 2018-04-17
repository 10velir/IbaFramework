package edu.bsuir.web.pages;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.element.Element;
import edu.bsuir.web.Locators.CandidatesPageElements;
import edu.bsuir.web.Locators.CreateResumeElements;
import edu.bsuir.web.Locators.GeneralReference;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class CandidatesPage {
    private WebDriver driver = WebDriverSingleton.getInstance();
    private WebDriverWait wait = new WebDriverWait(driver, 10);
    private List<WebElement> elements = null;

    public void setExperience(String num) {
        WebElement element = driver.findElement(CandidatesPageElements.EXPERIENCE);
        Select select = new Select(element);
        select.selectByValue(num);
    }

    public void setXpathForName(String name) {
        CreateResumeElements.xpathForName.format("//*[contains(text(),'%s ')]", name);
    }

    public void goToProfileOfCandidate() {
        WebElement element = driver.findElement(By.xpath(CreateResumeElements.xpathForName.toString()));
        System.out.println(By.xpath(CreateResumeElements.xpathForName.toString()));
        element.click();
    }

    public WebElement getDropDownMenuByNumber(int number) {
        if (elements != null) {
            return elements.get(number);
        } else {
            elements = driver.findElements(CandidatesPageElements.DROP_DOWN_MENU);
        }
        return elements.get(number);
    }


    public void clickStatusNew() {
        driver.findElement(CandidatesPageElements.STATUS_NEW).click();
    }

    public void driverWait(long sec) {

        driver.manage().timeouts().pageLoadTimeout(sec, TimeUnit.SECONDS);
    }

    public void clickStatusOnApprovalForTheVacancy() {
        driver.findElement(CandidatesPageElements.STATUS_ON_APPROVAL_FOR_THE_VACANCY).click();
    }

    public void clickStatusAvailableForApproval() {
        driver.findElement(CandidatesPageElements.STATUS_AVAILABLE_FOR_APPROVAL).click();
    }

    public void clickStatusHired() {
        driver.findElement(CandidatesPageElements.STATUS_HIRED).click();
    }

    public void clickChoiceVacancy() {
        try {
            getDropDownMenuByNumber(0).click();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        //driver.findElement(CandidatesPageElements.CHOICE_VACANCY).click();
    }

    public void info() {
        Set<Cookie> cookies = driver.manage().getCookies();
        Iterator<Cookie> itr = cookies.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("_______");
        System.out.println(((HasCapabilities) driver).getCapabilities());
    }

    public void searchInput(String searchInputWord) {
        WebElement element = driver.findElement(CandidatesPageElements.SEARCH_INPUT);
        element.clear();
        element.sendKeys(searchInputWord);
        setXpathForName(searchInputWord);
    }

    public void clickAgileDeveloper() {
        driver.findElement(CandidatesPageElements.AGILE_DEVELOPER).click();
    }

    public void closeOpenedButton() {
        driver.findElement(CandidatesPageElements.CLOSE_OPENED_BUTTON).click();
    }

    public void clickRelocationAvailable() {
        driver.findElement(CandidatesPageElements.RELOCATION_AVAILABLE).click();
    }

    public void clickRelocationUnavailable() {
        driver.findElement(CandidatesPageElements.RELOCATION_UNAVAILABLE).click();
    }

    public void clickEducationList() {
        try {
            getDropDownMenuByNumber(1).click();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public void clickEducationNotIndicated() {
        driver.findElement(CandidatesPageElements.EDUCATION_NOT_INDICATED).click();

    }

    public void clickGeneralSecondaryEducation() {
        driver.findElement(CandidatesPageElements.GENERAL_SECONDARY_EDUCATION).click();
    }

    public void clickProfessionalTechnical() {
        driver.findElement(CandidatesPageElements.PROFESSIONAL_TECHNICAL).click();
    }

    public void clickSecondarySpecial() {
        driver.findElement(CandidatesPageElements.SECONDARY_SPECIAL_EDUCATION).click();

    }

    public void clickHigherEducation() {
        driver.findElement(CandidatesPageElements.HIGHER_EDUCATION).click();
        //new Element("HIGHER_EDUCATION",CandidatesPageElements.HIGHER_EDUCATION).clickElement();

    }

    public void clickNongraduatedHigherEducation() {
        driver.findElement(CandidatesPageElements.NONGRADUATED_HIGHER_EDUCATION).click();
    }

    public void clickUnivercitiesList() {
        try {
            getDropDownMenuByNumber(2).click();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        //new Element("UNIVERCITIES_LIST",CandidatesPageElements.UNIVERCITIES_LIST).clickElement();
    }

    public void clickBSU() {
        driver.findElement(CandidatesPageElements.BSU).click();
        //new Element("BSU",CandidatesPageElements.BSU).clickElement();
    }

    public void clickBSUIR() {
        driver.findElement(CandidatesPageElements.BSUIR).click();
    }

    public void clickBSEU() {
        driver.findElement(CandidatesPageElements.BSEU).click();

    }

    public void clickBSTU() {
        driver.findElement(CandidatesPageElements.BSTU).click();
    }

    public void clickCompetenceList() {
        try {
            getDropDownMenuByNumber(3).click();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        //new Element("COMPETENCE_LIST",CandidatesPageElements.COMPETENCE_LIST).clickElement();
    }

    public void clickStrategicThinking() {
        driver.findElement(CandidatesPageElements.STRATEGIC_THINKING).click();
        //new Element("COMPETENCE_LIST",CandidatesPageElements.MC_ACCESS).clickElement();
    }

    public void clickEnglish() {
        driver.findElement(CandidatesPageElements.ENGLISH).click();
    }

    public void clickClearFilter() {
        driver.findElement(CandidatesPageElements.CLEAR_FILTER).click();
    }

    public void clickCreateProfileButton() {
        driver.findElement(CandidatesPageElements.CREATE_PROFILE_BUTTON).click();
    }


    public void goToMainPage() {
        driver.get(GeneralReference.MAIN_PAGE);
    }

    public void goToApplicationCreationPage() {
        driver.get(GeneralReference.APPLICATION_CREATION_PAGE);
    }

    public void goToRecruitingPage() {
        driver.get(GeneralReference.RECRUITING_PAGE);
    }

    public void goToCandidatesPage() {
        driver.get(GeneralReference.CANDIDATES_PAGE);
    }

    public String getCurrentUr1() {
        return driver.getCurrentUrl();
    }
    public void closeDriver() {
        driver.close();
    }
}
