package uploads;

import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.pdf2go.Pdf2goUploadPage;

import static utils.TestFiles.PDF_FILE;

@Epic("PDF2Go")
@Story("PDF To DOCX")
public class Pdf2goTest {
    private WebDriver driver;
    private Pdf2goUploadPage pdfPage;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.pdf2go.com/");
        pdfPage = new Pdf2goUploadPage(driver);
    }

    @Test(priority = 1)
    public void navigateToPdf(){
        pdfPage.goToPdfToWord();
    }

    @Test(priority = 2,dependsOnMethods = "navigateToPdf")
    public void uploadPDF(){
        pdfPage.uploadFile(PDF_FILE);
    }

    @Test(priority = 3,dependsOnMethods = "uploadPDF")
    public void download(){
        pdfPage.downloadConverted();
    }

    @AfterClass
    public void quit(){
        if (driver != null) {
            driver.quit();
        }
    }
}
