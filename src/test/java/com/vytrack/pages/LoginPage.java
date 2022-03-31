package com.vytrack.pages;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }


    //same with driver.findElement(By.id("prependedInput"))

    @FindAll({
            @FindBy(id="prependedInput"),
            @FindBy(name="_username"),
    })
   // @FindBy(id="prependedInput")
    public WebElement inputUsername;

    @FindBy(id="prependedInput2")
    public WebElement inputPassword;

    @FindBy(id="_submit")
    public WebElement btnLogin;

    public void login(String usernameStr,String passwordStr){

        inputUsername.sendKeys(usernameStr);
        inputPassword.sendKeys(passwordStr);
        btnLogin.click();

    }

    public void loginAsDriver(){

        String username=ConfigurationReader.get("driver_username");
        String password=ConfigurationReader.get("driver_password");
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        btnLogin.click();

    }


    public void loginAsStoreManager(){
        String username=ConfigurationReader.get("storemanager_username");
        String password=ConfigurationReader.get("storemanager_password");
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        btnLogin.click();


    }

}
