package pages.pdf2go;

import org.openqa.selenium.WebDriver;
import pages.base.BasePage;


public class Pdf2goUploadPage extends BasePage {

    public Pdf2goUploadPage(WebDriver driver) {
        super(driver);
    }
    // Navigate to PDF to Word
    public void goToPdfToWord() {
        click(Pdf2goLocators.PDF_TO_WORD);
    }

    public void uploadFile(String filepath){
        waitVisible(Pdf2goLocators.UPLOAD_BUTTON);
        sendKeys(Pdf2goLocators.UPLOAD_BUTTON,filepath);
        click(Pdf2goLocators.CONVERSION_BUTTON);
    }

    public void downloadConverted(){
        waitVisibleOnScreen(Pdf2goLocators.CONVERSION_VALIDATION);
        click(Pdf2goLocators.DOWNLOAD_BUTTON);
    }


}
