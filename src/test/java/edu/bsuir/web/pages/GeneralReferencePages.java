package edu.bsuir.web.pages;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.web.Locators.GeneralReference;
import org.openqa.selenium.WebDriver;

public class GeneralReferencePages {
    WebDriver driver = WebDriverSingleton.getInstance();
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
