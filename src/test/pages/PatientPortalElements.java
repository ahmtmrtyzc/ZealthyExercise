package src.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static src.test.testbase.BaseClass.driver;

public class PatientPortalElements {
    @FindBy (xpath = "//*[@id=\"__next\"]/div[2]/div[1]/div[2]/button")
    public WebElement userName;

    @FindBy (xpath = "//*[@id=\"composition-menu\"]/li[1]")
    public WebElement MyProfile;

    public PatientPortalElements() {
        PageFactory.initElements(driver, this);
    }
}
