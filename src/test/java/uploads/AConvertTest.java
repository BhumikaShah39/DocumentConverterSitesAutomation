package uploads;

import io.qameta.allure.Story;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.aConvert.AConvertUploadPage;

import static utils.TestFiles.*;

public class AConvertTest {
    private WebDriver driver;
    private AConvertUploadPage pdfPage;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.aconvert.com/");
        pdfPage = new AConvertUploadPage(driver);
    }

    @Test(priority = 1)
    @Story("Upload Files")
    public void uploadFile(){
        pdfPage.uploadFile(PDF_FILE);
    }

    @Test(priority = 2,dependsOnMethods = "uploadFile")
    public void selectAndConvert(){
        pdfPage.selectDocx();
        pdfPage.convertToWord();
    }

    @Test(priority = 3,dependsOnMethods = "selectAndConvert")
    public void download(){
        pdfPage.ConversionSuccess();
    }
}
