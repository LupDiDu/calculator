package org.example;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;

public class MobileCapabilities {

    private static DesiredCapabilities instance;

    public static DesiredCapabilities getAndroidCapabilities() throws MalformedURLException {
        if (instance == null) {
            instance = new DesiredCapabilities();
            instance.setCapability("platformName", "Android");
            instance.setCapability("deviceName", "Pixel 8 pro API 30");
            instance.setCapability("appPackage", "com.google.android.calculator");
            instance.setCapability("appActivity", "com.android.calculator2.Calculator");
            instance.setCapability("no_reset", true);
        }
        return instance;
    }
}