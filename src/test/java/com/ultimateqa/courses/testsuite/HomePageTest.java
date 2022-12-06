package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.pages.LoginPage;
import com.ultimateqa.courses.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    //Creating objects of 2 pages classes
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() throws InterruptedException {
        Thread.sleep(1500);
        //Invoking method from Home Page class to click on Sign in button
        homePage.clickOnSignInLink();
        //Invoking method from secure area Page class to verify text
        Assert.assertEquals(loginPage.getWelcomeBackText(), "Welcome Back!", "Sign In Page is not displayed");
    }

}
