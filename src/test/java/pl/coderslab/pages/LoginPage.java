package pl.coderslab.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    protected WebDriver driver;

    @FindBy(className = "hidden-sm-down")
    private WebElement signInButton;

    @FindBy (name = "email")
    private WebElement eMailInput;

    @FindBy (name = "password")
    private WebElement passwordInput;

    @FindBy (id = "submit-login")
    private WebElement submitButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

//    public void signIn() {
//        signInButton.click();
//
//    }

    public void loginAs(String email, String password) {

        eMailInput.clear();
        eMailInput.sendKeys(email);
        passwordInput.clear();
        passwordInput.sendKeys(password);
        submitButton.click();

    }
}
