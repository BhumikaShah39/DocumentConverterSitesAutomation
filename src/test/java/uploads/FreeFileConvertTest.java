package uploads;

import io.qameta.allure.Description;
import io.qameta.allure.Story;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.freefileconvert.FreeFileConvertUpload;
import static utils.TestData.FFC_EMAIL;
import static utils.TestData.FFC_PASSWORD;


import static utils.TestFiles.PDF_FILE;

@Epic("File Conversion")
@Feature("FreeFileConvert")
public class FreeFileConvertTest {

    private WebDriver driver;
    private FreeFileConvertUpload freeFilePage;


    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://freefileconvert.com/");
        freeFilePage = new FreeFileConvertUpload(driver);
    }

    @Test(priority = 1)
    @Story("Navigate to Login")
    @Description("Click Login link and wait for login page to load")
    public void navigateToLoginPage() {
        freeFilePage.navigateToLoginPage();
    }

    @Test(priority = 2, dependsOnMethods = "navigateToLoginPage")
    @Story("Perform login")
    @Description("Enter credentials and login")
    public void login() {
        freeFilePage.enterLoginCredentials(FFC_EMAIL, FFC_PASSWORD);
        freeFilePage.login();
    }

    @Test(priority = 3, dependsOnMethods = "login")
    @Story("Upload PDF and convert")
    @Description("Upload PDF file and convert to DOCX")
    public void uploadAndConvertPdf() {
        freeFilePage.uploadFile(PDF_FILE);

        // Choose conversion type and start conversion
        freeFilePage.conversion("DOCX");
    }

//    @AfterClass
//    public void teardown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}
