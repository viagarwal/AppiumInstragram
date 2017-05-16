package AppiumTests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ProfilePage;

public class AppiumTest extends AndroidSetUp {

    @BeforeClass
    public void setUp() throws Exception {
        prepareAndroidForAppium();
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void loginTest() throws InterruptedException {
        new LoginPage(driver).logintoInstagram("manjunath3850","Password@123");
        new ProfilePage(driver).updateProfile();
    }
}