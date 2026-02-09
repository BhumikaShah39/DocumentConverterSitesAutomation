package pages.ilovepdf;

import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class IlovePdfUploadPage extends BasePage {

    public IlovePdfUploadPage(WebDriver driver) {
        super(driver);
    }

    // Navigate to PDF to Word
    public void goToPdfToWord() {
        click(IlovePdfLocators.PDF_TO_WORD_LINK);
    }

    // Upload file
    public void uploadFile(String filePath) {
        sendKeys(IlovePdfLocators.FILE_INPUT, filePath);
    }

    public void waitForConversionComplete() {
        waitVisible(IlovePdfLocators.DOWNLOAD_BUTTON); // example
    }

}

