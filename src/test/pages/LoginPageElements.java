package src.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static src.test.testbase.BaseClass.driver;

public class LoginPageElements {

    @FindBy(id = "filled-adornment-email")
    public WebElement emailAddress;


    @FindBy(id = "filled-adornment-password")
    public WebElement password;

    @FindBy (xpath = "//*[@id=\"__next\"]/div[4]/div/div/form/button")
    public WebElement lgnBtn;

    @FindBy (xpath = "//*[@id=\"__next\"]/div[4]/div/div/form/p")
    public WebElement InvalidLoginCredentials;

    public LoginPageElements() {
        PageFactory.initElements(driver, this);
    }
}
