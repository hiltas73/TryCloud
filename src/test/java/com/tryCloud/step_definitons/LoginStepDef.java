package com.tryCloud.step_definitons;

import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef {

    LoginPage loginPage=new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        Driver.get().get(ConfigurationReader.get("url"));
    }




    @When("user Enters valid password and username")
    public void user_Enters_valid_password_and_username() throws InterruptedException {



        String username=ConfigurationReader.get("username");
        String password=ConfigurationReader.get("password");
        System.out.println(username);
        System.out.println(password);
        loginPage.usernameInput.sendKeys(ConfigurationReader.get("username"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.get("password"));




    }

    @When("user clicks login button")
    public void user_clicks_login_button() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.loginButton.click();
    }

    @Then("Dashboard Page opened")
    public void dashboard_Page_opened() {
        // Write code here that turns the phrase above into concrete actions

        String actualTitle=Driver.get().getTitle();
        Assert.assertEquals("Dashboard - Trycloud QA",actualTitle);
    }

}
