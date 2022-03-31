package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {


    @Given("the user is on login page")
    public void the_user_is_on_login_page() {

        //instead of driver object we will use Driver.get() directly
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("the user enter the driver information")
    public void the_user_enter_thr_driver_information() {
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);

        BrowserUtils.waitFor(5);


    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        BrowserUtils.waitFor(3);
        String actualTitle = Driver.get().getTitle();

        Assert.assertEquals("Verify Title", "Dashboard", actualTitle);

    }

    @When("the user enter the sales manager information")
    public void the_user_enter_the_sales_manager_information() {

        String username = ConfigurationReader.get("salesmanager_username");
        String password = ConfigurationReader.get("salesmanager_password");
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);


    }


    @When("the user enter the store manager information")
    public void the_user_enter_the_store_manager_information() {
        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }


    @When("the users logs in using {string} and {string}")
    public void the_users_logs_in_using_and(String username, String password) {

        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }

    @Then("the title contains {string}")
    public void the_title_contains(String expectedTitle) {


        BrowserUtils.waitFor(3);
        System.out.println("Expected title: " + expectedTitle );
        Assert.assertTrue("Actual Title "+Driver.get().getTitle(),Driver.get().getTitle().contains(expectedTitle));

    }

    @When("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
         //go to login page
        Driver.get().get(ConfigurationReader.get("url"));

        String username=null;
        String password=null;
        LoginPage loginPage = new LoginPage();

        BrowserUtils.waitFor(3);

        if (userType.equals("driver")){
            username = ConfigurationReader.get("driver_username");
            password = ConfigurationReader.get("driver_password");

        } else if (userType.equals("store manager")) {
            username = ConfigurationReader.get("storemanager_username");
            password = ConfigurationReader.get("storemanager_password");

        } else if (userType.equals("sales manager")) {
            username = ConfigurationReader.get("salesmanager_username");
            password = ConfigurationReader.get("salesmanager_password");

        }

        loginPage.login(username, password);




    }
}

