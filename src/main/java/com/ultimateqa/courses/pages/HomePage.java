package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    //Declaring By type variable
    By signInLink =By.xpath("//a[contains(text(),'Sign In')]");

    //This method will click on Sign in link
    public void clickOnSignInLink(){
        clickOnElement(signInLink);
    }

}
