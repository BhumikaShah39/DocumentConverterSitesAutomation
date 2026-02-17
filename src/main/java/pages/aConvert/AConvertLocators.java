package pages.aConvert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AConvertLocators {
    public static final By UPLOAD_BUTTON = By.xpath("//div[contains(@class,'moxie-shim moxie-shim-html5')]//input[@type='file']");
    public static final By TARGET_BUTTON = By.xpath("//select[@id='targetformat']");
    public static final By CONVERT_BUTTON = By.xpath("//a[@id='uploader_start']");
    public static final By CONVERSION_SUCCESS = By.xpath("//td[normalize-space()='1']");
    public static final By DOWNLOAD_BUTTON = By.xpath("//a[contains(@href,\".docx\")][@rel=\"nofollow\"]");

}
