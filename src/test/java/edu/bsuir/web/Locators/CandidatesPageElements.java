package edu.bsuir.web.Locators;

import org.openqa.selenium.By;

public class CandidatesPageElements implements GeneralReference{

    public static final By EXPERIENCE = By.xpath("//*[@id = 'experience']");
    public static final By STATUS_NEW = By.xpath("//*[@id = 'status_New']");
    public static final By STATUS_ON_APPROVAL_FOR_THE_VACANCY = By.xpath("//*[@id = 'status_OnApprovalForTheVacancy']");
    public static final By STATUS_AVAILABLE_FOR_APPROVAL = By.xpath("//*[@id = 'status_AvailableForApproval']");
    public static final By STATUS_HIRED = By.xpath("//*[@id = 'status_Hired']");
    public static final By AGILE_DEVELOPER = By.xpath("//li//div//input[@value = '9']");
    public static final By RELOCATION_AVAILABLE = By.xpath("//*[@id = 'relocation_Available']");
    public static final By RELOCATION_UNAVAILABLE = By.xpath("//*[@id = 'relocation_Unavailable']");

    public static final By DROP_DOWN_MENU = By.xpath("//*[@title = 'Р’С‹Р±СЂР°С‚СЊ']");

    public static final By SEARCH_INPUT = By.xpath("//*[@class='form-control']");
    public static final By EDUCATION_NOT_INDICATED = By.xpath("//*[@id = 'education_filtermultiselect-0']");
    public static final By GENERAL_SECONDARY_EDUCATION = By.xpath("//*[@id = 'education_filtermultiselect-1']");
    public static final By PROFESSIONAL_TECHNICAL = By.xpath("//*[@id = 'education_filtermultiselect-2']");
    public static final By SECONDARY_SPECIAL_EDUCATION = By.xpath("//*[@id = 'education_filtermultiselect-3']");
    public static final By HIGHER_EDUCATION = By.xpath("//*[@id = 'education_filtermultiselect-4']");
    public static final By NONGRADUATED_HIGHER_EDUCATION = By.xpath("//[@class = 'multiselect-container dropdown-menu']");
    public static final By BSU = By.xpath("//*[@id = 'universities_filtermultiselect-0']");
    public static final By BSUIR = By.xpath("//*[@id = 'universities_filtermultiselect-1']");
    public static final By BSEU = By.xpath("//*[@id = 'universities_filtermultiselect-2']");
    public static final By BSTU = By.xpath("//*[@id = 'universities_filtermultiselect-3']");
    public static final By STRATEGIC_THINKING = By.xpath("//div/input[@value = '381']");
    public static final By ENGLISH = By.xpath("//*[@id = 'competencies_filtermultiselect-1']");
    public static final By CLEAR_FILTER = By.xpath("//*[@id = 'filter-clear-link']");
    public static final By CREATE_PROFILE_BUTTON = By.xpath("//*[@id = 'createProfileButton']");
    public static final By CLOSE_OPENED_BUTTON = By.xpath("//*[@aria-expanded='true']");
}
