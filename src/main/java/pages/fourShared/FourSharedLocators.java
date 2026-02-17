package pages.fourShared;

import org.openqa.selenium.By;

public class FourSharedLocators {
    public static final By SIGNIN_BUTTON = By.xpath("//div[@class='index-header-signin-button jsShowSignIn']");
    public static final By WITH_EMAIL = By.xpath("//div[@class='signin-var-button btn-email jsGoEmailLogic']");
    public static final By EMAIL_FIELD = By.xpath("(//input[@id='email'])[1]");
    public static final By CONTINUE_BUTTON = By.xpath("//button[normalize-space()='Continue']");
    public static final By PASSWORD_FIELD = By.xpath("//input[@id='password']");
    public static final By UPLOAD_BUTTON = By.xpath("//a[@class='bodyButton filesel showTip']//input[@id='tfid1']");
    public static final By UPLOAD_SUCCESS = By.xpath("//div[@class='slimScrollDiv']//div[@id='uiFileId_1']//div[@class='floatLeft alignLeft ffshadow f12 lucida completeMessage jsCompleted'][normalize-space()='Upload completed']");
}
