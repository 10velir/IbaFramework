package edu.bsuir.web.pages;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.web.Locators.LoginElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LoginPage extends GeneralReferencePages{
    WebDriver driver = WebDriverSingleton.getInstance();

    public void driverWait(int sec) {
        driver.manage().timeouts().pageLoadTimeout(sec, TimeUnit.SECONDS);
    }
    public void typeLogin(String login){
        WebElement element = driver.findElement(LoginElements.LOGIN);
        element.clear();
        element.sendKeys(login);
    }

    public void typePassword(String password){
        WebElement element = driver.findElement(LoginElements.PASSWORD);
        element.clear();
        element.sendKeys(password);
    }

    public void clickLoginButton(){
        WebElement element = driver.findElement(LoginElements.LOGIN_BUTTON);
        element.click();
    }

    public String getTitle() {
        return driver.getTitle();
    }
    public String getFloatBoxTitle() {
        WebElement element = driver.findElement(LoginElements.FLOATBOX);
        return element.getText();
    }
    public void destroy() {
        driver = null;
    }


}
