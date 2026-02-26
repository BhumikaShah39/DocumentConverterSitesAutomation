package pages.zamzar;

import org.openqa.selenium.By;

public class ZamzarLocators {
    public static final By CHOOSE_FILE = By.xpath("(//input[@type='file'])[2]");
    public static final By UPLOAD_VALIDATION = By.xpath("//td[@class='file-name']");
    public static final By FORMAT = By.xpath("//select[@id='format']");
    public static final By CONVERT = By.xpath("//button[@id='convert']");
    public static final By DOWNLOAD_BUTTON = By.xpath("//*[@id=\"conversions\"]/tbody/tr/td[2]/a");

}
