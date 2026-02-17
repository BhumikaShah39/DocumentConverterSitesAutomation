package pages.sejdapdf;

import org.openqa.selenium.By;

public class SejdaPdfLocators {
    public static final By PDF_TO_WORD_BUTTON = By.xpath("//body//section[@id='content']//section//div[1]//div[1]//ul[1]//li[9]//a[1]");
    public static final By UPLOAD_PDF = By.xpath("//input[@title=\"Upload\"]");
    public static final By KEEP_LAYOUT_BUTTON = By.xpath("//a[@data-choice='layout']");
    public static final By CONTINUE_BUTTON = By.xpath("//button[@id='step2ChoicesContinueBtn']");
    public static final By IFRAME = By.xpath("//iframe[@id='taskResultsFrame']");
    public static final By CONVERSION_SUCCESS = By.xpath("//span[normalize-space()='Your document is ready']");
    public static final By DOWNLOAD_BUTTON = By.xpath("//a[@id='download-btn']");
    public static final By DOWNLOAD_SUCCESS = By.xpath("//a[@id='startNewBtn']");
}
