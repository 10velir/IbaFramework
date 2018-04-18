package edu.bsuir.web.pages;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.element.Element;
import edu.bsuir.web.Locators.QuestionsElements;
import edu.bsuir.web.Locators.GeneralReference;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class QuestionsPage {
    WebDriver driver = WebDriverSingleton.getInstance();

    public void clickAddButton() {
        driver.findElement(QuestionsElements.ADD).click();
    }

    public void setQuestionText(String questionText) {
        WebElement element = driver.findElement(QuestionsElements.QUESTION_TEXT);
        element.clear();
        element.sendKeys(questionText);
    }

    public void setQuestionAnswer(String questionAnswer) {
        WebElement element = driver.findElement(QuestionsElements.QUESTION_ANSWER);
        element.clear();
        element.sendKeys(questionAnswer);
    }

    public void clickSaveQuestionButton() {
        driver.findElement(QuestionsElements.SAVE_QUESTION_BTN).click();
    }

    public void clickCancelQuestionButton() {
        driver.findElement(QuestionsElements.CANCEL_QUESTION_BTN).click();
    }
}
