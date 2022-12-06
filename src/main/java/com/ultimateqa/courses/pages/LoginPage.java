package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    //Declaring By type variables
    By welcomeBackText = By.xpath("//h2[contains(text(),'Welcome Back!')]");
    By emailField = By.id("user[email]");
    By passwordField = By.name("user[password]");
    By signInButton = By.xpath("//button[contains(text(),'Sign in')]");
    By errorMessage = By.xpath("//li[contains(text(),'Invalid email or password.')]");

    //This method will get text
    public String getWelcomeBackText() {
        return getTextFromElement(welcomeBackText);
    }

    //This method will send text to user field
    public void enterEmailId(String emailId) {
        sendTextToElement(emailField, emailId);
    }

    //This method will send text to password field
    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    //This method will click on sign in button
    public void clickOnSignInButton() {
        clickOnElement(signInButton);
    }

    //This method will get error message in case of using invalid credentials
    public String getErrorTextWithInvalidCredentials() {
        return getTextFromElement(errorMessage);
    }
}
