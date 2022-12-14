package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.pages.LoginPage;
import com.ultimateqa.courses.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    //Creating objects of 2 pages classes
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyTheErrorMessage() {
        //Invoking method from Home Page class to click on Sign in button
        homePage.clickOnSignInLink();
        //Invoking method from Login Page class to enter username
        loginPage.enterEmailId("abc@gmail.com");
        //Invoking method from Login Page class to enter password
        loginPage.enterPassword("abc123");
        //Invoking method from Login Page class to click on login button
        loginPage.clickOnSignInButton();
        //Invoking method from secure area Page class to verify text
        Assert.assertEquals(loginPage.getErrorTextWithInvalidCredentials(), "Invalid email or password.", "Error message didn't appear");
    }

}
