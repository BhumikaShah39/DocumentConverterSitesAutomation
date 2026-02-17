package pages.sejdapdf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class SejdaPdfUploadPage extends BasePage {

    public SejdaPdfUploadPage(WebDriver driver) {
        super(driver);
    }

    public void pdfToWord(){
        click(SejdaPdfLocators.PDF_TO_WORD_BUTTON);
    }

    public void uploadPdf(String filepath){
        sendKeys(SejdaPdfLocators.UPLOAD_PDF, filepath);
    }

    public void confirmation(){
        click(SejdaPdfLocators.KEEP_LAYOUT_BUTTON);
        click(SejdaPdfLocators.CONTINUE_BUTTON);
    }

    public void switchToIframe(){
        waitAndSwitchToFrame(SejdaPdfLocators.IFRAME);
        waitVisible(SejdaPdfLocators.CONVERSION_SUCCESS);
    }

    public void download(){
        click(SejdaPdfLocators.DOWNLOAD_BUTTON);
        waitVisible(SejdaPdfLocators.DOWNLOAD_SUCCESS);
    }
}
