package pages.fourShared;

import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class FourSharedUploadPage extends BasePage {
    public FourSharedUploadPage(WebDriver driver) {
        super(driver);
    }

    public void navigateToLoginPage() {
        waitVisible(FourSharedLocators.SIGNIN_BUTTON);
        click(FourSharedLocators.SIGNIN_BUTTON);
        click(FourSharedLocators.WITH_EMAIL);
    }

    public void login(String email, String password) {
        waitVisibleOnScreen(FourSharedLocators.EMAIL_FIELD);
        sendKeys(FourSharedLocators.EMAIL_FIELD, email);
        click(FourSharedLocators.CONTINUE_BUTTON);
        waitClickable(FourSharedLocators.PASSWORD_FIELD);
        sendKeys(FourSharedLocators.PASSWORD_FIELD, password);
        click(FourSharedLocators.CONTINUE_BUTTON);
    }

    public void uploadFiles(String... filepath){
        String joinedFiles = String.join("\n", filepath);
        sendKeys(FourSharedLocators.UPLOAD_BUTTON, joinedFiles);
        waitVisibleOnScreen(FourSharedLocators.UPLOAD_SUCCESS);
    }


}
