package edu.bsuir.web.Locators;

import org.openqa.selenium.By;

public class LoginElements implements GeneralReference {

    public static final By LOGIN = By.xpath("//input[@id='_58_login']");
    public static final By PASSWORD = By.xpath("//input[@id='_58_password']");
    public static final By LOGIN_BUTTON = By.xpath("//div[@class = 'button-holder ']//button");

    public static final By USERNAME = By.xpath("//div[@class = 'float-box']//div//h3");

    public static final By CELL = By.xpath("//a[@href = 'http://testing.cld.iba.by/web/guest/recruiting']");
    public static final By FLOATBOX = By.xpath("//div[@class = 'float-box']//div//h3");
    public static final By REQUEST = By.xpath("//*[@id=\"addRequest\"]/div[2]/div[2]/a");
}