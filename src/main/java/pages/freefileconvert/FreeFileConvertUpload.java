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
    public void conversion(String fileType) {

        WebElement formatDropdown = waitClickable(FreeFileConvertLocators.FORMAT_DROPDOWN);
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView({block:'center'});", formatDropdown);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", formatDropdown);

        WebElement search = waitVisible(FreeFileConvertLocators.SEARCH);
        search.clear();
        search.sendKeys(fileType);

        click(FreeFileConvertLocators.SELECT_DOCX);

        WebElement convertBtn = waitClickable(FreeFileConvertLocators.CONVERT_BUTTON);
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView({block:'center'});", convertBtn);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", convertBtn);
    }
}