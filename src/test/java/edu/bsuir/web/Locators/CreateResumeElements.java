package edu.bsuir.web.Locators;

import org.openqa.selenium.By;

import java.util.Formatter;

public class CreateResumeElements {

    public static Formatter xpathForName = new Formatter();

    public static final By SURNAME = By.xpath("//*[@id = 'surname']");
    public static final By NAME = By.xpath("//*[@id = 'name']");
    public static final By SECOND_NAME = By.xpath("//*[@id = 'secondName']");
    public static final By PRIMARY_TELEPHONE = By.xpath("//*[@id = 'primaryTelephone']");
    public static final By ADD_TELEPHONE_BUTTON = By.xpath("//*[@id = 'addTelephoneButton']");
    public static final By REMOVE_TELEPHONE_BUTTON = By.xpath("//*[@id = 'removeTel']");
    public static final By PRIMARY_EMAIL = By.xpath("//*[@id = 'primaryEmail']");
    public static final By ADD_EMAIL_BUTTON = By.xpath("//*[@id = 'addEmailButton']");
    public static final By REMOVE_EMAIL_BUTTON = By.xpath("//*[@id = 'removeEmail']");
    public static final By SKYPE = By.xpath("//*[@id = 'skype']");
    public static final By COUNTRY = By.xpath("//*[@id = 'country']");
    public static final By CITY = By.xpath("//*[@id = 'city']");
    public static final By RELOCATION = By.xpath("//*[@id = 'relocation']");
    public static final By DATE_OF_BIRTH_DAY = By.xpath("//*[@id = 'dateOfBirthDay']");
    public static final By DATE_OF_BIRTH_MONTH = By.xpath("//*[@id = 'dateOfBirthMonth']");
    public static final By DATE_OF_BIRTH_YEAR = By.xpath("//*[@id = 'dateOfBirthYear']");
    public static final By EDUCATION = By.xpath("//select[@id = 'education']");
    public static final By DESIRED_POSITION = By.xpath("//*[@id = 'desiredPosition']");

    public static final By DYNAMIC_XPATH_TO_CANDIDATE_BY_NAME = By.xpath("//*[@contains(text(),'РРІР°РЅ')]");

    public static final By EDIT_COMPETENCIES_BTN = By.xpath("//*[@id = 'editCompetence']");
    public static final By SYBD = By.xpath("//span[text() = 'РЎРЈР‘Р” Рё СЃСЂРµРґСЃС‚РІР° СЂР°Р±РѕС‚С‹ СЃ РЎРЈР‘Р”']");
    public static final By SQL = By.xpath("//span[text() = 'SQL']");
    public static final By BASE_WEB = By.xpath("//span[text() = 'Р‘Р°Р·РѕРІС‹Рµ web С‚РµС…РЅРѕР»РѕРіРёРё']");
    public static final By JSON = By.xpath("//span[text() = 'JSON']");

    public static final By TAB_EDUCATION = By.xpath("//*[@href = '#tab-8']");
    public static final By ADD_INFORMATION_1 = By.xpath("//span[text() = 'Добавить информацию']");
    public static final By UNIVERSITY = By.xpath("//*[@id = 'university']");
    public static final By FACULTY = By.xpath("//*[@id = 'faculty']");
    public static final By SPECIALIZATION = By.xpath("//*[@id = 'specialization']");
    public static final By START_YEAR = By.xpath("//*[@id = 'startYear']");
    public static final By END_YEAR = By.xpath("//*[@id = 'endYear']");
    public static final By DELETE_INFORMATION_1 = By.xpath("//span[text() = 'Удалить']");

    public static final By TAB_WORK_EXPERIENCE = By.xpath("//*[@href = '#tab-2']");
    public static final By ADD_INFORMATION_2 = By.xpath("//span[text() = 'Добавить информацию']");
    public static final By POSITION = By.xpath("//*[@id = 'position']");
    public static final By COMPANY = By.xpath("//*[@id = 'company']");
    public static final By START_WORK_MONTH = By.xpath("//*[@id = 'startMonth']");
    public static final By START_WORK_YEAR = By.xpath("//*[@id = 'startYear']");
    public static final By WORK_TILL_NOW = By.xpath("//*[@id = 'tillNow']");
    public static final By END_WORK_MONTH = By.xpath("//*[@id = 'endMonth']");
    public static final By END_WORK_YEAR = By.xpath("//*[@id = 'endYear']");
    public static final By DESCRIPTION = By.xpath("//*[@id = 'description']");
    public static final By DELETE_INFORMATION_2 = By.xpath("//span[text() = 'Удалить']");

    public static final By TAB_MOTIVATION = By.xpath("//*[@href = '#tab-3']");
    public static final By MATERIAL_INTEREST = By.xpath("//*[@id = 'motivationFactor_0']");
    public static final By STABILITY_AND_SECURITY = By.xpath("//*[@id = 'motivationFactor_1']");
    public static final By WORKING_CONDITIONS = By.xpath("//*[@id = 'motivationFactor_2']");
    public static final By SOCIAL_STATUS = By.xpath("//*[@id = 'motivationFactor_3']");
    public static final By INTERPERSONAL_RELATIONSHIPS = By.xpath("//*[@id = 'motivationFactor_4']");
    public static final By DEGREE_OF_WORK_CONTROL = By.xpath("//*[@id = 'motivationFactor_5']");
    public static final By CAREER_GROWTH = By.xpath("//*[@id = 'motivationFactor_6']");
    public static final By AVAILABILITY_OF_HIGH_ACCOUTABILITY = By.xpath("//*[@id = 'motivationFactor_7']");
    public static final By CREATIVITY = By.xpath("//*[@id = 'motivationFactor_8']");
    public static final By RECOGNITION = By.xpath("//*[@id = 'motivationFactor_9']");
    public static final By TRAINING_AND_DEVELOPMENT = By.xpath("//*[@id = 'motivationFactor_10']");
    public static final By ACHIEVEMENT_OF_RESULTS = By.xpath("//*[@id = 'motivationFactor_11']");

    public static final By TAB_REFERENCES = By.xpath("//*[@href = '#tab-6']");
    public static final By ADD_INFORMATION_3 = By.xpath("//span[text() = 'Добавить информацию']");
    public static final By REC_NAME = By.xpath("//*[@id = 'recName']");
    public static final By REC_POSITION = By.xpath("//*[@id = 'recPosition']");
    public static final By REC_COMPANY = By.xpath("//*[@id = 'recCompany']");
    public static final By REC_TELEPHONE = By.xpath("//*[@id = 'recTelephone']");
    public static final By DELETE_INFORMATION_3 = By.xpath("//span[text() = 'Удалить']");

    public static final String noAvatar = "http://testing.cld.iba.by/TC-RecruitingAndOnboarding-portlet/common/css/images/no-avatar.jpg";
    public static final By PROFILE_IMAGE = By.xpath("//input[@id='profileImage']");
    public static final By CURRENT_IMAGE = By.id("currentImage");
    public static final By CHANGE_IMG_LINK = By.id("changeImgLink");
    public static final String PATH_TO_IMAGE = "resources/human.png";
    public static final String FILE_PATH = "resources/sikuli/FilePath.JPG";
    public static final String OPEN_BUTTON = "resources/sikuli/OpenButton.JPG";
    public static final By PLUS_ATTACHMENT = By.xpath("//*[@class = 'fa fa-plus add-attachment']");
    public static final By REMUVE_ATTACHMENT = By.xpath("//*[@class = 'fa fa-remove remove remove-attachment']");

}
