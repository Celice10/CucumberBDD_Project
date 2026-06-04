package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // 10 seconds wait time
    }

    public void click(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void type(WebElement element, String text) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.click(); // Click to focus the input field
        element.clear();
        element.sendKeys(text);
    }

    public boolean isVisible(WebElement element){
        return wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
    }
}
