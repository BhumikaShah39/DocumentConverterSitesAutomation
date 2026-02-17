package pages.pdf2go;

import org.openqa.selenium.By;

public class Pdf2goLocators {

    public static final By PDF_TO_WORD = By.xpath("//body/div[4]/div[2]/div[2]/a[5]");
    public static final By UPLOAD_BUTTON = By.xpath("//input[@id='fileUploadInput']");
    public static final By CONVERSION_BUTTON = By.xpath("//button[@id='submitBtn']");
    public static final By CONVERSION_VALIDATION = By.xpath("//h2[normalize-space()='Done']");
    public static final By DOWNLOAD_BUTTON = By.xpath("//a[contains(text(),'Download')]");

}
