package com.bagal.tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.openqa.selenium.Platform;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidTest {
    @Test
    public void androidLaunchDemoTest() throws MalformedURLException, InterruptedException {
        UiAutomator2Options uiAutomator2Options = new UiAutomator2Options();
        uiAutomator2Options.setPlatformName("Android");
        uiAutomator2Options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
        uiAutomator2Options.setDeviceName("Sayaji Test Device");
        uiAutomator2Options.setApp(System.getProperty("user.dir")+"/src/test/resources/apps/AndroidMyDemoAppRN.apk");
        AndroidDriver androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723"),uiAutomator2Options);
        androidDriver.quit();
    }
}
