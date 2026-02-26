package uploads;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.zamzar.ZamzarLocators;
import pages.zamzar.ZamzarUploadPage;
import utils.TestFiles;

import static utils.TestFiles.*;

@Epic("File Conversion")
@Feature("Zamzar conversion")
public class ZamzarTest {
    private WebDriver driver;
    private ZamzarUploadPage zamzarPage;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.zamzar.com/");
        zamzarPage = new ZamzarUploadPage(driver);
    }

    @Test(priority = 1)
    public void uploadFiles(){
        zamzarPage.uploadFile(TestFiles.PDF_FILE);
    }

    @Test(priority = 2, dependsOnMethods = "uploadFiles")
    public void selectFormat(){
        zamzarPage.selectDocFormat();
    }

    @Test(priority = 3, dependsOnMethods = {"uploadFiles", "selectFormat"})
    public void convert(){
        zamzarPage.convert();
    }

    @Test(priority = 4, dependsOnMethods = {"convert"})
    public void download(){
        zamzarPage.download();
    }





}
