package pages.ilovepdf;

import org.openqa.selenium.By;

public class IlovePdfLocators {
    // Main page links
    public static final By PDF_TO_WORD_LINK = By.xpath("//a[@title='PDF to Word']");

    // Upload page elements
    public static final By FILE_INPUT = By.xpath("//input[@type='file']");

    //Validate download button after upload
    public static final By DOWNLOAD_BUTTON = By.xpath(("//a[@id='pickfiles']"));

}



