package uploads;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.sejdapdf.SejdaPdfUploadPage;

import static utils.TestFiles.PDF_FILE;

@Epic("Sejda PDF")
@Feature("PDF to Word")
public class SejdaPdfTest {
    private WebDriver driver;
    private SejdaPdfUploadPage pdfPage;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.sejda.com/");
        pdfPage = new SejdaPdfUploadPage(driver);
    }

    @Test(priority = 1)
    @Story("Navigate to PDF to Word")
    @Description("Click PDF to Word link")
    public void navigateToPdfToWord() {
        pdfPage.pdfToWord();
    }

    @Test(priority = 2, dependsOnMethods = "navigateToPdfToWord")
    @Story("Upload PDF and convert")
    public void uploadPdfFile() {
        pdfPage.uploadPdf(PDF_FILE);
        pdfPage.confirmation();
    }

    @Test(priority = 3, dependsOnMethods = "uploadPdfFile")
    @Story("Download Word File")
    public void download(){
        pdfPage.switchToIframe();
        pdfPage.download();
    }


    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
