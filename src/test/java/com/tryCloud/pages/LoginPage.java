package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy
            (id="user")
    public WebElement usernameInput;

    @FindBy
            (id="password")
    public WebElement passwordInput;

    @FindBy
            (id="submit-form")
    public WebElement loginButton;



}
