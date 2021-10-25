package pl.coderslab.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.coderslab.pages.AddressPage;
import pl.coderslab.pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class UserLoginSteps {

    private WebDriver driver;

    @Given("I am logged in on my store page with login and password")
    public void loggingIn() {
        System.setProperty("webdriver.chrome.driver",
                "src/test/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=authentication");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAs("m.igrek@gmail.com", "martaigrek");

    }


    @When("I click user name")
    public void iClickUserName() {
        driver.findElement(By.className("account")).click();
    }

    @And("I click add address button")
    public void iClickAddAddressButton() {
        driver.findElement(By.id("address-link")).click();
    }


    @And("^I enter text in <address> <zipCode> <city>  fields and choose country$")
    public void iEnterTextInAddressZipCodeCityFieldsAndChooseCountry(String address, String zipCode, String city) {
        AddressPage addressPage = new AddressPage(driver);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        addressPage.enterAddress(address, zipCode, city);
    }


}
