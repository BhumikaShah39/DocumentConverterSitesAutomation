package pages.aConvert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.base.BasePage;

public class AConvertUploadPage extends BasePage {
    public AConvertUploadPage(WebDriver driver) {
        super(driver);
    }

    public void uploadFile(String filepath) {
        WebElement fileInput = driver.findElement(AConvertLocators.UPLOAD_BUTTON);

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].style.display='block';", fileInput);

        fileInput.sendKeys(filepath);
    }


    public void selectDocx(){
        WebElement docx = driver.findElement(AConvertLocators.TARGET_BUTTON);
        Select targetFormat = new Select(docx);
        targetFormat.selectByValue("docx");
    }

    public void convertToWord(){
        click(AConvertLocators.CONVERT_BUTTON);
    }
    public void ConversionSuccess(){
        waitVisibleOnScreen(AConvertLocators.CONVERSION_SUCCESS);
        click(AConvertLocators.DOWNLOAD_BUTTON);
    }

}
