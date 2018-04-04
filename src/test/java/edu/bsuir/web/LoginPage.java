package edu.bsuir.web;

import edu.bsuir.driver.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    WebDriver driver = WebDriverSingleton.getInstance();

    public void enterLoginPage(){
        driver.get(LoginElements.URL);
    }
    public void enterLoginPage1(){
        driver.get(LoginElements.URL1);
    }
    public void enterLoginPage2(){
        driver.get(LoginElements.URL2);
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

    public String typeUserName(){
        WebElement element = driver.findElement(LoginElements.USERNAME);
        return element.getText();

    }

    public void clickCell(){
        WebElement element = driver.findElement(LoginElements.CELL);
        element.click();
    }

    public void clickRequest(){
        WebElement element = driver.findElement(LoginElements.REQUEST);
        element.click();
    }

    public void enterPosition(String position){
        WebElement element = driver.findElement(LoginElements.POSITION);
        element.clear();
        element.sendKeys(position);
    }

    public void enterPlannedClosingDate (String plannedClosingDate){
        WebElement element = driver.findElement(LoginElements.PLANNED_CLOSING_DATE);
        element.clear();
        element.sendKeys(plannedClosingDate);
    }

    public void clickPriorityRadioBtn(){
        WebElement element = driver.findElement(LoginElements.PRIORITY_RADIO_BTN);
        element.click();
    }

    public void enterQuantity(String quantity){
        WebElement element = driver.findElement(LoginElements.QUANTITY);
        element.clear();
        element.sendKeys(quantity);
    }

    public void enterCreationReason(String creationReason){
        WebElement element = driver.findElement(LoginElements.CREATION_REASON);
        element.clear();
        element.sendKeys(creationReason);
    }

    public void clickType(){
        WebElement element = driver.findElement(LoginElements.TYPE);
        element.click();
    }

    public void enterSalary(String salary){
        WebElement element = driver.findElement(LoginElements.SALARY);
        element.clear();
        element.sendKeys(salary);
    }

    public void enterEmployees(String employees){
        WebElement element = driver.findElement(LoginElements.EMPLOYEES);
        element.clear();
        element.sendKeys(employees);
    }

    public void enterBusinessTrip(String businessTrip){
        WebElement element = driver.findElement(LoginElements.BUSINESS_TRIP);
        element.clear();
        element.sendKeys(businessTrip);
    }

    public void enterTimetable(String timetable){
        WebElement element = driver.findElement(LoginElements.TIMETABLE);
        element.clear();
        element.sendKeys(timetable);
    }

    public void enterProbationPeriod(String probationPeriod){
        WebElement element = driver.findElement(LoginElements.PROBATION_PERIOD);
        element.clear();
        element.sendKeys(probationPeriod);
    }

    public void enterResponsibilities(String responsibilities){
        WebElement element = driver.findElement(LoginElements.RESPONSIBILITIES);
        element.clear();
        element.sendKeys(responsibilities);
    }

    public void clickCandidateType(){
        WebElement element = driver.findElement(LoginElements.CANDIDATE_TYPE);
        element.click();
    }

    public void enterEducationSpecialization(String educationSpecialization){
        WebElement element = driver.findElement(LoginElements.EDUCATION_SPECIALIZATION);
        element.clear();
        element.sendKeys(educationSpecialization);
    }

    public void enterPriorityWorkingExperience(String priorityWorkingExperience){
        WebElement element = driver.findElement(LoginElements.PRIORITY_WORKING_EXPERIENCE);
        element.clear();
        element.sendKeys(priorityWorkingExperience);
    }

    public void enterUndesirableWorkingExperience(String undesirableWorkingExperience){
        WebElement element = driver.findElement(LoginElements.UNDESIRABLE_WORKING_EXPERIENCE);
        element.clear();
        element.sendKeys(undesirableWorkingExperience);
    }

    public void enterComment(String comment){
        WebElement element = driver.findElement(LoginElements.COMMENT);
        element.clear();
        element.sendKeys(comment);
    }

    public void clickSaveBtn(){
        WebElement element = driver.findElement(LoginElements.SAVE_BTN);
        element.click();
    }

    public void clickLoginButton2() {
        WebElement element = driver.findElement(LoginElements.getLoginButton("Войти"));
        element.click();
    }
    public String getFloatBoxTitle() {
        WebElement element = driver.findElement(LoginElements.FLOATBOX);
        return element.getText();
    }
    public String getTitle() {
        return driver.getTitle();
    }
    public void driverWait(int sec) {
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }
    public void setCurrency(String num) {
        WebElement element = driver.findElement(LoginElements.CURRENCY);
        Select select = new Select(element);
        select.selectByValue(num);
    }
    public void setJobType(String num) {
        WebElement element = driver.findElement(LoginElements.JOB_TYPE);
        Select select = new Select(element);
        select.selectByValue("3");
    }
    public void setEducation(String education) {
        WebElement element = driver.findElement(LoginElements.EDUCATION);
        Select select = new Select(element);
        select.selectByValue(education);
    }
    public void editApplication() {
        WebElement element = driver.findElement(LoginElements.EDIT_APPLICATION);
        element.click();
    }
    public void clickToAprovalButton() {
        WebElement element = driver.findElement(LoginElements.SEND_TO_APPROVAL_BUTTON);
        element.click();
    }
    public void selectAllSkills() {
        WebElement element = driver.findElement(LoginElements.SELECT_SKILLS);
        element.click();
    }
    public void selectBaseSkills() {
        WebElement element = driver.findElement(LoginElements.SELECT_BASE_SKILLS);
        element.click();
    }
    public void clickConfirmButon() {
        WebElement element = driver.findElement(LoginElements.CONFIRM_BUTTON);
        element.click();
    }
    public void chooseStressResistance() {
        WebElement element = driver.findElement(LoginElements.STRESS_RESISTANCE);
        Actions action = new Actions(driver);
        action.doubleClick(element);
        action.perform();
    }
    public void chooseTrainability() {
        WebElement element = driver.findElement(LoginElements.TRAINABILITY);
        Actions action = new Actions(driver);
        action.doubleClick(element);
        action.perform();
    }
    public void selectBaseWebSkills(){
        WebElement element = driver.findElement(LoginElements.BASE_WEB);
        element.click();
    }
    public void chooseJS() {
        WebElement element = driver.findElement(LoginElements.JS);
        Actions action = new Actions(driver);
        action.doubleClick(element);
        action.perform();
    }
    public void chooseCSS3() {
        WebElement element = driver.findElement(LoginElements.CSS3);
        Actions action = new Actions(driver);
        action.doubleClick(element);
        action.perform();
    }
    public void chooseHTML() {
        WebElement element = driver.findElement(LoginElements.HTML);
        Actions action = new Actions(driver);
        action.doubleClick(element);
        action.perform();
    }
}
