package pages.zamzar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.aConvert.AConvertLocators;
import pages.base.BasePage;

public class ZamzarUploadPage extends BasePage {

    public ZamzarUploadPage(WebDriver driver) {
        super(driver);
    }

    public void uploadFile(String filePath){

        WebElement fileInput = driver.findElement(ZamzarLocators.CHOOSE_FILE);
        fileInput.sendKeys(filePath);
        System.out.println("File value: " + fileInput.getAttribute("value"));
        waitVisibleOnScreen(ZamzarLocators.UPLOAD_VALIDATION);

    }

    public void selectDocFormat() {
        WebElement dropdown = waitVisible(ZamzarLocators.FORMAT);
        Select select = new Select(dropdown);
        select.selectByValue("doc");
    }

    public void convert(){
        waitClickable(ZamzarLocators.CONVERT);
        click(ZamzarLocators.CONVERT);
    }

    public void download(){
        waitVisible(ZamzarLocators.DOWNLOAD_BUTTON);
        click(ZamzarLocators.DOWNLOAD_BUTTON);
    }
}


