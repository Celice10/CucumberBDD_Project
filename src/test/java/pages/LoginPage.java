package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    @FindBy (css = "button.user-pill")
    public WebElement loginButton;

    @FindBy (id = "login-email")
    public WebElement usernameField;

    @FindBy(id = "login-password")
    public WebElement passwordField;

    @FindBy(id="login-submit")
    public WebElement submitLoginButton;

    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[3]/div/button")
    public WebElement userMenuButton;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    public void enterUsername(String username){
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password){
        passwordField.sendKeys(password);
    }

    public void clickSubmitLoginButton(){
        submitLoginButton.click();
    }

    public void login(String username, String password){
        clickLoginButton();
        enterUsername(username);
        enterPassword(password);
        clickSubmitLoginButton();
    }

    public boolean isMenuButtonDisplayed(){
        return userMenuButton.isDisplayed();
    }

}
