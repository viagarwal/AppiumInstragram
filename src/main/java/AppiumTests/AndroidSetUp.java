package AppiumTests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

public class AndroidSetUp {
	
    protected AndroidDriver driver;

    protected void prepareAndroidForAppium() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium-version", "1.0");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Nexus");
        capabilities.setCapability("app", "C:\\RestAssured\\TestInstragram\\apps\\com.instagram.android-10.19.1-APK4Fun.com.apk");
        capabilities.setCapability("appPackage", "com.instagram.android");
        capabilities.setCapability("appActivity", "com.instagram.android.activity.MainTabActivity");
        capabilities.setCapability(MobileCapabilityType.FULL_RESET, true);
        new DesiredCapabilities("appWaitActivity", null, null);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
}