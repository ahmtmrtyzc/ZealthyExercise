package src.test.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import src.test.utils.CommonMethods;
import src.test.utils.ConfigsReader;

import static src.test.testbase.PageInitializer.*;

public class LoginSteps extends CommonMethods {

    @When("I enter valid email address")
    public void i_enter_valid_email_address() {
        sendText(login.emailAddress, ConfigsReader.getProperty("username"));
    }

    @When("I enter valid password")
    public void i_enter_valid_password() {
        sendText(login.password, ConfigsReader.getProperty("password"));
    }

    @When("I click to login button")
    public void i_click_to_login_button() {
        click(login.lgnBtn);
    }

    @Then("I validate that I am logged in")
    public void i_validate_that_i_am_logged_in() {

        click(portal.userName);
        wait(1);
        click(portal.MyProfile);
        wait(3);

        String expected = "Ahmet Yazici";
        String actual = profil.name.getText();

        if (actual.equals(expected)) {
            System.out.println("Test Passed !");
        } else {
            System.out.println("Test Failed !");
        }
    }

    @When("I enter invalid password")
    public void i_enter_invalid_password() {
        sendText(login.password, ConfigsReader.getProperty("invalidpassword"));
    }

    @Then("I validate that Invalid Credentials is displayed")
    public void i_validate_that_invalid_credentials_is_displayed() {
        String expected = "Invalid login credentials";
        String actual = login.InvalidLoginCredentials.getText();
        Assert.assertEquals("Invalid login credentials !", expected, actual);

    }

    @When("I enter invalid email address")
    public void i_enter_invalid_email_address() {
        sendText(login.emailAddress, ConfigsReader.getProperty("invalidusername"));
    }


}
