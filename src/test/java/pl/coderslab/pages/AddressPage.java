package pl.coderslab.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressPage extends LoginPage {

    private WebDriver driver;

    public AddressPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (name = "address1")
    private WebElement addressInput;

    @FindBy (name = "postcode")
    private WebElement postcodeInput;

    @FindBy (name = "city")
    private WebElement cityInput;

    @FindBy (name = "id_country")
    private WebElement countrySelector;

  //  #content > div > div > form > section > div:nth-child(14) > div.col-md-6 > select


    public void enterAddress (String address, String zipCode, String city) {

        addressInput.click();
    addressInput.sendKeys(address);
    postcodeInput.sendKeys(zipCode);
    cityInput.sendKeys(city);
    countrySelector.click();

    }

}
