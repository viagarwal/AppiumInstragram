package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage extends BasePage{
	
	By profile = By.xpath("//android.widget.FrameLayout[@index='4']");
	By editProfileLink = By.xpath("//android.widget.TextView[@text='Edit your profile']");
	By changePhoto = By.xpath("//android.widget.TextView[@text='Change Photo']");
	By newProfilePhoto = By.xpath("//android.widget.TextView[@text='New Profile Photo']");
	By next = By.xpath("//android.widget.TextView[@text='Next' and @index='2']");
	
	public ProfilePage(WebDriver driver) {
		super(driver);
	}
	
	public ProfilePage updateProfile(){
		waitForVisibilityOf(profile);
		driver.findElement(profile).click();
		waitForVisibilityOf(editProfileLink);
		driver.findElement(editProfileLink).click();
		waitForVisibilityOf(changePhoto);
		driver.findElement(changePhoto).click();
		waitForVisibilityOf(newProfilePhoto);
		driver.findElement(newProfilePhoto).click();
		waitForVisibilityOf(next);
		driver.findElement(next).click();
		waitForVisibilityOf(next);
		driver.findElement(next).click();
		waitForVisibilityOf(editProfileLink);
		return new ProfilePage(driver);
	}
}