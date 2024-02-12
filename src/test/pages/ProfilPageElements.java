package src.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static src.test.testbase.BaseClass.driver;

public class ProfilPageElements {

    @FindBy (xpath = "//*[@id=\"__next\"]/div[3]/div[1]/div/div/div[1]/div/h6[1]")
    public WebElement name;

    public ProfilPageElements() {
        PageFactory.initElements(driver, this);
    }
}
