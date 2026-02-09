package pages.freefileconvert;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;
import pages.freefileconvert.FreeFileConvertLocators;

public class FreeFileConvertUpload extends BasePage {
    public FreeFileConvertUpload(WebDriver driver) {
        super(driver);
    }

    public void navigateToLoginPage() {
        waitVisible(FreeFileConvertLocators.LOGIN_BUTTON);
        click(FreeFileConvertLocators.LOGIN_BUTTON);
    }

    public void enterLoginCredentials(String email, String password) {
        waitVisible(FreeFileConvertLocators.EMAIL);
        sendKeys(FreeFileConvertLocators.EMAIL, email);
        sendKeys(FreeFileConvertLocators.PASSWORD, password);
    }

    public void login() {
        waitVisible(FreeFileConvertLocators.LOGIN);
        click(FreeFileConvertLocators.LOGIN);
    }

    // Upload file
    public void uploadFile(String filePath) {
        waitVisible(FreeFileConvertLocators.FILE_INPUT);
        sendKeys(FreeFileConvertLocators.FILE_INPUT, filePath);
    }

//select type and convert
    public void conversion(String fileType){
        WebElement el = waitVisible(FreeFileConvertLocators.FORMAT_DROPDOWN);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", el);

        waitVisible(FreeFileConvertLocators.SEARCH);
        sendKeys(FreeFileConvertLocators.SEARCH, fileType);

        waitVisible(FreeFileConvertLocators.SELECT_DOCX);
        click(FreeFileConvertLocators.SELECT_DOCX);

        waitClickable(FreeFileConvertLocators.CONVERT_BUTTON);
        click(FreeFileConvertLocators.CONVERT_BUTTON);
    }

}