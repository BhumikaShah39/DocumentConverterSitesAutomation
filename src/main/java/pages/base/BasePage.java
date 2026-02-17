package pages.base;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    protected WebElement waitVisible(By locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    protected WebElement waitVisibleOnScreen(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }


    protected WebElement waitClickable(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }


    protected void click(By locator) {
        WebElement el = waitClickable(locator);
        try {
            el.click();
        } catch (Exception e) {
            // fallback to JS click if intercepted
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", el);
        }
    }

    protected void sendKeys(By locator, String value) {
        waitVisible(locator).sendKeys(value);
    }

    protected void waitAndSwitchToFrame(By locator) {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
    }


//    protected void hiddenUploadFile(By locator, String filePath) {
//        WebElement fileInput = driver.findElement(locator);
//
//        // Force input to be visible & enabled
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript(
//                "arguments[0].style.display='block';" +
//                        "arguments[0].style.visibility='visible';" +
//                        "arguments[0].style.opacity=1;",
//                fileInput
//        );
//
//        fileInput.sendKeys(filePath);
//    }




}
