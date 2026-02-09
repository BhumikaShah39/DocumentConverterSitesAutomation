package pages.freefileconvert;

import org.openqa.selenium.By;

public class FreeFileConvertLocators {

    public static final By LOGIN_BUTTON = By.xpath("//a[normalize-space()='Login']");
    public static final By EMAIL = By.xpath("//input[@id='email']");
    public static final By PASSWORD = By.xpath("//input[@id='password']");
    public static final By LOGIN = By.xpath("//button[@type='submit']");
    public static final By FILE_INPUT = By.cssSelector("input[type='file']");
    public static final By FORMAT_DROPDOWN =
            By.xpath("(//input[@placeholder='Select format...'])[1]");

    public static final By SEARCH =
            By.xpath("//div[contains(@class,'format-dropdown')]//input");

    public static final By SELECT_DOCX =
            By.xpath("//button[contains(@title,'DOCX')]");

    public static final By CONVERT_BUTTON =
            By.xpath("//button[@class='btn btn-primary convert-all-button']");







}
