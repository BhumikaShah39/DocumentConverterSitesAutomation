package uploads;

import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.ilovepdf.IlovePdfUploadPage;

import static utils.TestFiles.PDF_FILE;

@Epic("PDF Tools")
@Feature("PDF to Word")
public class IlovePdfTest {

    private WebDriver driver;
    private IlovePdfUploadPage pdfPage;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ilovepdf.com/");
        pdfPage = new IlovePdfUploadPage(driver);
    }

    @Test(priority = 1)
    @Story("Navigate to PDF to Word")
    @Description("Click PDF to Word link")
    public void navigateToPdfToWord() {
        pdfPage.goToPdfToWord();
    }

    @Test(priority = 2, dependsOnMethods = "navigateToPdfToWord")
    @Story("Upload PDF and convert")
    public void uploadPdfFile() {
        pdfPage.uploadFile(PDF_FILE);
        pdfPage.waitForConversionComplete();
    }


    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

