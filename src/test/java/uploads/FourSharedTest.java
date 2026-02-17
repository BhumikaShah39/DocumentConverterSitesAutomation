package uploads;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.fourShared.FourSharedUploadPage;
import pages.sejdapdf.SejdaPdfUploadPage;

import static utils.TestData.*;
import static utils.TestFiles.*;

@Epic("4Shared")
@Story("MultipleFileUpload")
public class FourSharedTest {
    private WebDriver driver;
    private FourSharedUploadPage pdfPage;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.4shared.com/");
        pdfPage = new FourSharedUploadPage(driver);
    }
    @Test(priority = 1)
    @Story("Navigate to Login")
    @Description("Click Login link and wait for login page to load")
    public void navigateToLoginPage() {
        pdfPage.navigateToLoginPage();
    }

    @Test(priority = 2, dependsOnMethods = "navigateToLoginPage")
    @Story("Perform login")
    @Description("Enter credentials and login")
    public void login() {
        pdfPage.login(FS_EMAIL, FS_PASSWORD);
    }

    @Test(priority = 3, dependsOnMethods = "login")
    @Story("Upload Files")
    @Description("Upload files of extension .pdf, .jpg, .csv, .docx, xlsx")
    public void uploadFile(){
        pdfPage.uploadFiles(PDF_FILE, DOCX_FILE, XLSX_FILE, CSV_FILE, JPG_FILE);
    }
}
