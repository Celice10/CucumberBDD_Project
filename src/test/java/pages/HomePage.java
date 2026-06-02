package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    WebDriver driver;


    @FindBy(css = "button.user-pill")
    public WebElement menuButton;

    @FindBy(css = "button.nav-dropdown-item")
    List<WebElement> dropdownOptions;


    public HomePage(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }


    public void clickMenuButton() {
        menuButton.click();
    }

    //All dropdown share the same class, so we can use a loop to find the correct one by its text
    public void selectDropdownOption(String optionName) {

        for (WebElement option : dropdownOptions) {
            if (option.getText().trim().equalsIgnoreCase(optionName)) {
                option.click();
                break;
            }
        }
    }
}
