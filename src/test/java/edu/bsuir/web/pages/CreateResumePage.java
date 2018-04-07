package edu.bsuir.web.pages;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.element.Element;
import edu.bsuir.web.Locators.CandidatesPageElements;
import edu.bsuir.web.Locators.CreateResumeElements;
import edu.bsuir.web.Locators.GeneralReference;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class CreateResumePage {
    WebDriver driver = WebDriverSingleton.getInstance();

    public void goToCreateResumePage() {

        driver.get(GeneralReference.CREATE_RESUME_PAGE);
    }

    //поменять изображение

    public void setSurname(String surname){
        WebElement element = driver.findElement(CreateResumeElements.SURNAME);
        element.clear();
        element.sendKeys(surname);
    }

    public void setName(String name){
        WebElement element = driver.findElement(CreateResumeElements.NAME);
        element.clear();
        element.sendKeys(name);
    }

    public void setSecondName(String secondName){
        WebElement element = driver.findElement(CreateResumeElements.SECOND_NAME);
        element.clear();
        element.sendKeys(secondName);
    }

    public void setPrimaryTelephone(String primaryTelephone){
        WebElement element = driver.findElement(CreateResumeElements.PRIMARY_TELEPHONE);
        element.clear();
        element.sendKeys(primaryTelephone);
    }

    public void clickAddTelephoneButton(){
        WebElement element = driver.findElement(CreateResumeElements.ADD_TELEPHONE_BUTTON);
        element.click();
    }

    public void clickRemoveTelephoneButton(){
        WebElement element = driver.findElement(CreateResumeElements.REMOVE_TELEPHONE_BUTTON);
        element.click();
    }

    public void setPrimaryEmail(String primaryEmail){
        WebElement element = driver.findElement(CreateResumeElements.PRIMARY_EMAIL);
        element.clear();
        element.sendKeys(primaryEmail);
    }

    public void clickAddEmailButton(){
        WebElement element = driver.findElement(CreateResumeElements.ADD_EMAIL_BUTTON);
        element.click();
    }

    public void clickRemoveEmailButton(){
        WebElement element = driver.findElement(CreateResumeElements.REMOVE_EMAIL_BUTTON);
        element.click();
    }

    public void setSkype(String skype){
        WebElement element = driver.findElement(CreateResumeElements.SKYPE);
        element.clear();
        element.sendKeys(skype);
    }

    public void setCountry(String country){
        WebElement element = driver.findElement(CreateResumeElements.COUNTRY);
        element.clear();
        element.sendKeys(country);
    }

    public void setAddress(String address){
        WebElement element = driver.findElement(CreateResumeElements.CITY);
        element.clear();
        element.sendKeys(address);
    }

    public void clickRelocation(){
        WebElement element = driver.findElement(CreateResumeElements.RELOCATION);
        element.click();
    }

    public void setDateOfBirthDay(String dateOfBirthDay){
        WebElement element = driver.findElement(CreateResumeElements.DATE_OF_BIRTH_DAY);
        element.clear();
        element.sendKeys(dateOfBirthDay);
    }

    public void setDateOfBirthMonth(String dateOfBirthMonth){
        WebElement element = driver.findElement(CreateResumeElements.DATE_OF_BIRTH_MONTH);
        element.clear();
        element.sendKeys(dateOfBirthMonth);
    }

    public void setDateOfBirthYear(String dateOfBirthYear){
        WebElement element = driver.findElement(CreateResumeElements.DATE_OF_BIRTH_YEAR);
        element.clear();
        element.sendKeys(dateOfBirthYear);
    }

    public void setEducation(String num) {
        WebElement element = driver.findElement(CreateResumeElements.EDUCATION);
        Select select = new Select(element);
        select.selectByValue(num);
    }

    public void setDesiredPosition(String desiredPosition){
        WebElement element = driver.findElement(CreateResumeElements.DESIRED_POSITION);
        element.clear();
        element.sendKeys(desiredPosition);
    }

    public void clickEditCompetenciesBtn(){
        WebElement element = driver.findElement(CreateResumeElements.EDIT_COMPETENCIES_BTN);
        element.click();
    }

    //компетенций там хуева туча, мб потом добавим

    public void clickTabEducation(){
        WebElement element = driver.findElement(CreateResumeElements.TAB_EDUCATION);
        element.click();
    }

    public void clickAddInformation1(){
        WebElement element = driver.findElement(CreateResumeElements.ADD_INFORMATION_1);
        element.click();
    }

    public void setUniversity(String university){
        WebElement element = driver.findElement(CreateResumeElements.UNIVERSITY);
        element.clear();
        element.sendKeys(university);
    }

    public void setFaculty(String faculty){
        WebElement element = driver.findElement(CreateResumeElements.FACULTY);
        element.clear();
        element.sendKeys(faculty);
    }

    public void setSpecialization(String specialization){
        WebElement element = driver.findElement(CreateResumeElements.SPECIALIZATION);
        element.clear();
        element.sendKeys(specialization);
    }

    public void setStartYear(String num) {
        WebElement element = driver.findElement(CreateResumeElements.START_YEAR);
        Select select = new Select(element);
        select.selectByValue(num);
    }

    public void setEndYear(String num) {
        WebElement element = driver.findElement(CreateResumeElements.END_YEAR);
        Select select = new Select(element);
        select.selectByValue(num);
    }

    public void clickDeleteInformation1(){
        WebElement element = driver.findElement(CreateResumeElements.DELETE_INFORMATION_1);
        element.click();
    }

    public void clickTabWorkExperience(){
        WebElement element = driver.findElement(CreateResumeElements.TAB_WORK_EXPERIENCE);
        element.click();
    }

    public void clickAddInformation2(){
        WebElement element = driver.findElement(CreateResumeElements.ADD_INFORMATION_2);
        element.click();
    }

    public void setPosition(String position){
        WebElement element = driver.findElement(CreateResumeElements.POSITION);
        element.clear();
        element.sendKeys(position);
    }

    public void setCompany(String company){
        WebElement element = driver.findElement(CreateResumeElements.COMPANY);
        element.clear();
        element.sendKeys(company);
    }

    public void setStartWorkMonth(String num) {
        WebElement element = driver.findElement(CreateResumeElements.START_WORK_MONTH);
        Select select = new Select(element);
        select.selectByValue(num);
    }

    public void setStartWorkYear(String num) {
        WebElement element = driver.findElement(CreateResumeElements.START_WORK_YEAR);
        Select select = new Select(element);
        select.selectByValue(num);
    }

    public void clickWorkTillNow(){
        WebElement element = driver.findElement(CreateResumeElements.WORK_TILL_NOW);
        element.click();
    }

    public void setEndWorkMonth(String num) {
        WebElement element = driver.findElement(CreateResumeElements.END_WORK_MONTH);
        Select select = new Select(element);
        select.selectByValue(num);
    }

    public void setEndWorkYear(String num) {
        WebElement element = driver.findElement(CreateResumeElements.END_WORK_YEAR);
        Select select = new Select(element);
        select.selectByValue(num);
    }

    public void setDescription(String description){
        WebElement element = driver.findElement(CreateResumeElements.DESCRIPTION);
        element.clear();
        element.sendKeys(description);
    }

    public void clickDeleteInformation2(){
        WebElement element = driver.findElement(CreateResumeElements.DELETE_INFORMATION_2);
        element.click();
    }

    public void clickTabMotivation(){
        WebElement element = driver.findElement(CreateResumeElements.TAB_MOTIVATION);
        element.click();
    }

    public void setMaterialInterest(String num) {
        WebElement element = driver.findElement(CreateResumeElements.MATERIAL_INTEREST);
        Select select = new Select(element);
        select.selectByValue(num);
    }

    public void setStabilityAndSecurity(String num) {
        WebElement element = driver.findElement(CreateResumeElements.STABILITY_AND_SECURITY);
        Select select = new Select(element);
        select.selectByValue(num);
    }

    public void setWorkingConditions(String num) {
        WebElement element = driver.findElement(CreateResumeElements.WORKING_CONDITIONS);
        Select select = new Select(element);
        select.selectByValue(num);
    }

    public void setSocialStatus(String num) {
        WebElement element = driver.findElement(CreateResumeElements.SOCIAL_STATUS);
        Select select = new Select(element);
        select.selectByValue(num);
    }

    public void setInterpersonalRelationships(String num) {
        WebElement element = driver.findElement(CreateResumeElements.INTERPERSONAL_RELATIONSHIPS);
        Select select = new Select(element);
        select.selectByValue(num);
    }

    public void setDegreeOfWorkControl(String num) {
        WebElement element = driver.findElement(CreateResumeElements.DEGREE_OF_WORK_CONTROL);
        Select select = new Select(element);
        select.selectByValue(num);
    }

    public void setCareerGrowth(String num) {
        WebElement element = driver.findElement(CreateResumeElements.CAREER_GROWTH);
        Select select = new Select(element);
        select.selectByValue(num);
    }

    public void setAvailabilityOfHighAccountability(String num) {
        WebElement element = driver.findElement(CreateResumeElements.AVAILABILITY_OF_HIGH_ACCOUTABILITY);
        Select select = new Select(element);
        select.selectByValue(num);
    }

    public void setCreativity(String num) {
        WebElement element = driver.findElement(CreateResumeElements.CREATIVITY);
        Select select = new Select(element);
        select.selectByValue(num);
    }

    public void setRecognition(String num) {
        WebElement element = driver.findElement(CreateResumeElements.RECOGNITION);
        Select select = new Select(element);
        select.selectByValue(num);
    }

    public void setTrainingAndDevelopment(String num) {
        WebElement element = driver.findElement(CreateResumeElements.TRAINING_AND_DEVELOPMENT);
        Select select = new Select(element);
        select.selectByValue(num);
    }

    public void setAchievementOfResuts(String num) {
        WebElement element = driver.findElement(CreateResumeElements.ACHIEVEMENT_OF_RESULTS);
        Select select = new Select(element);
        select.selectByValue(num);
    }

    public void clickTabReferences(){
        WebElement element = driver.findElement(CreateResumeElements.TAB_REFERENCES);
        element.click();
    }

    public void clickAddInformation3(){
        WebElement element = driver.findElement(CreateResumeElements.ADD_INFORMATION_3);
        element.click();
    }

    public void setRecName(String recName){
        WebElement element = driver.findElement(CreateResumeElements.REC_NAME);
        element.clear();
        element.sendKeys(recName);
    }

    public void setRecPosition(String recPosition){
        WebElement element = driver.findElement(CreateResumeElements.REC_POSITION);
        element.clear();
        element.sendKeys(recPosition);
    }

    public void setRecCompany(String recCompany){
        WebElement element = driver.findElement(CreateResumeElements.REC_COMPANY);
        element.clear();
        element.sendKeys(recCompany);
    }

    public void setRecTelephone(String recTelephone){
        WebElement element = driver.findElement(CreateResumeElements.REC_TELEPHONE);
        element.clear();
        element.sendKeys(recTelephone);
    }

    public void clickDeleteInformation3(){
        WebElement element = driver.findElement(CreateResumeElements.DELETE_INFORMATION_3);
        element.click();
    }
}
