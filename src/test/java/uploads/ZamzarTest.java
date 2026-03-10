package uploads;

import io.qameta.allure.Allure;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.zamzar.ZamzarLocators;
import pages.zamzar.ZamzarUploadPage;
import utils.TestFiles;

import static utils.TestFiles.*;

@Epic("Zamzar Test")
@Feature("Zamzar conversion")
public class ZamzarTest {
    private WebDriver driver;
    private ZamzarUploadPage zamzarPage;

    @BeforeClass
    @Step("Step 1: Navigating to Zamzar Website")
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.zamzar.com/");
        zamzarPage = new ZamzarUploadPage(driver);
    }


    @Step("Step 2: Uploading PDF File to Zamzar Website")
    @Test(priority = 1)
    public void uploadFiles(){
        Allure.step("Uploading PDF");
        zamzarPage.uploadFile(TestFiles.PDF_FILE);
    }

    @Step("Step 3: Selecting DOCX format")
    @Test(priority = 2, dependsOnMethods = "uploadFiles")
    public void selectFormat(){
        zamzarPage.selectDocFormat();
    }

    @Step("Step 4: Converting to PDF")
    @Test(priority = 3, dependsOnMethods = {"uploadFiles", "selectFormat"})
    public void convert(){
        zamzarPage.convert();
    }

    @Step("Step 5: Downloading DOCX File")
    @Test(priority = 4, dependsOnMethods = {"convert"})
    public void download(){
        zamzarPage.download();
    }





}
