package edu.bsuir.web.pages;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.web.Locators.ApplicationElemets;
import edu.bsuir.web.Locators.LoginElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class ApplicationPage extends GeneralReferencePages {
    WebDriver driver = WebDriverSingleton.getInstance();
    public void enterPosition(String position){
        WebElement element = driver.findElement(ApplicationElemets.POSITION);
        element.clear();
        element.sendKeys(position);
    }

    public void enterPlannedClosingDate (String plannedClosingDate){
        WebElement element = driver.findElement(ApplicationElemets.PLANNED_CLOSING_DATE);
        element.clear();
        element.sendKeys(plannedClosingDate);
    }

    public void clickPriorityRadioBtn(){
        WebElement element = driver.findElement(ApplicationElemets.PRIORITY_RADIO_BTN);
        element.click();
    }

    public void enterQuantity(String quantity){
        WebElement element = driver.findElement(ApplicationElemets.QUANTITY);
        element.clear();
        element.sendKeys(quantity);
    }

    public void enterCreationReason(String creationReason){
        WebElement element = driver.findElement(ApplicationElemets.CREATION_REASON);
        element.clear();
        element.sendKeys(creationReason);
    }

    public void clickType(){
        WebElement element = driver.findElement(ApplicationElemets.TYPE);
        element.click();
    }

    public void enterSalary(String salary){
        WebElement element = driver.findElement(ApplicationElemets.SALARY);
        element.clear();
        element.sendKeys(salary);
    }

    public void enterEmployees(String employees){
        WebElement element = driver.findElement(ApplicationElemets.EMPLOYEES);
        element.clear();
        element.sendKeys(employees);
    }

    public void enterBusinessTrip(String businessTrip){
        WebElement element = driver.findElement(ApplicationElemets.BUSINESS_TRIP);
        element.clear();
        element.sendKeys(businessTrip);
    }

    public void enterTimetable(String timetable){
        WebElement element = driver.findElement(ApplicationElemets.TIMETABLE);
        element.clear();
        element.sendKeys(timetable);
    }

    public void enterProbationPeriod(String probationPeriod){
        WebElement element = driver.findElement(ApplicationElemets.PROBATION_PERIOD);
        element.clear();
        element.sendKeys(probationPeriod);
    }

    public void enterResponsibilities(String responsibilities){
        WebElement element = driver.findElement(ApplicationElemets.RESPONSIBILITIES);
        element.clear();
        element.sendKeys(responsibilities);
    }

    public void clickCandidateType(){
        WebElement element = driver.findElement(ApplicationElemets.CANDIDATE_TYPE);
        element.click();
    }

    public void enterEducationSpecialization(String educationSpecialization){
        WebElement element = driver.findElement(ApplicationElemets.EDUCATION_SPECIALIZATION);
        element.clear();
        element.sendKeys(educationSpecialization);
    }

    public void enterPriorityWorkingExperience(String priorityWorkingExperience){
        WebElement element = driver.findElement(ApplicationElemets.PRIORITY_WORKING_EXPERIENCE);
        element.clear();
        element.sendKeys(priorityWorkingExperience);
    }

    public void enterUndesirableWorkingExperience(String undesirableWorkingExperience){
        WebElement element = driver.findElement(ApplicationElemets.UNDESIRABLE_WORKING_EXPERIENCE);
        element.clear();
        element.sendKeys(undesirableWorkingExperience);
    }

    public void enterComment(String comment){
        WebElement element = driver.findElement(ApplicationElemets.COMMENT);
        element.clear();
        element.sendKeys(comment);
    }

    public void clickSaveBtn(){
        WebElement element = driver.findElement(ApplicationElemets.SAVE_BTN);
        element.click();
    }



    public void driverWait(int sec) {
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }
    public void setCurrency(String num) {
        WebElement element = driver.findElement(ApplicationElemets.CURRENCY);
        Select select = new Select(element);
        select.selectByValue(num);
    }
    public void setJobType(String num) {
        WebElement element = driver.findElement(ApplicationElemets.JOB_TYPE);
        Select select = new Select(element);
        select.selectByValue("3");
    }
    public void setEducation(String education) {
        WebElement element = driver.findElement(ApplicationElemets.EDUCATION);
        Select select = new Select(element);
        select.selectByValue(education);
    }
    public void editApplication() {
        WebElement element = driver.findElement(ApplicationElemets.EDIT_APPLICATION);
        element.click();
    }
    public void clickToAprovalButton() {
        WebElement element = driver.findElement(ApplicationElemets.SEND_TO_APPROVAL_BUTTON);
        element.click();
    }
    public void selectAllSkills() {
        WebElement element = driver.findElement(ApplicationElemets.SELECT_SKILLS);
        element.click();
    }
    public void selectBaseSkills() {
        WebElement element = driver.findElement(ApplicationElemets.SELECT_BASE_SKILLS);
        element.click();
    }
    public void clickConfirmButon() {
        WebElement element = driver.findElement(ApplicationElemets.CONFIRM_BUTTON);
        element.click();
    }
    public void chooseStressResistance() {
        WebElement element = driver.findElement(ApplicationElemets.STRESS_RESISTANCE);
        Actions action = new Actions(driver);
        action.doubleClick(element);
        action.perform();
    }
    public void chooseTrainability() {
        WebElement element = driver.findElement(ApplicationElemets.TRAINABILITY);
        Actions action = new Actions(driver);
        action.doubleClick(element);
        action.perform();
    }
    public void selectBaseWebSkills(){
        WebElement element = driver.findElement(ApplicationElemets.BASE_WEB);
        element.click();
    }
    public void chooseJS() {
        WebElement element = driver.findElement(ApplicationElemets.JS);
        Actions action = new Actions(driver);
        action.doubleClick(element);
        action.perform();
    }
    public void chooseCSS3() {
        WebElement element = driver.findElement(ApplicationElemets.CSS3);
        Actions action = new Actions(driver);
        action.doubleClick(element);
        action.perform();
    }
    public void chooseHTML() {
        WebElement element = driver.findElement(ApplicationElemets.HTML);
        Actions action = new Actions(driver);
        action.doubleClick(element);
        action.perform();
    }
}
