package org.example;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.PageFactory;


public abstract class BasePage {
    protected AndroidDriver driver;

    public BasePage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}