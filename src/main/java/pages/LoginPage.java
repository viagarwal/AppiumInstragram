package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
	
	By instragram = By.className("android.widget.TextView");
	By password = By.xpath("//android.widget.EditText[@index='2']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage logintoInstagram(String userName , String passwordStr) throws InterruptedException {
        waitForVisibilityOf(instragram);
        click("android.widget.TextView","Already have an account");
        waitForVisibilityOf(password);
        sendKeys("android.widget.EditText", "Phone number",userName);
        waitForVisibilityOf(password);
        driver.findElement(password).sendKeys(passwordStr);
        click("android.widget.TextView","Log In");
        return new LoginPage(driver);
     }
        
        public void click(String className ,String text) throws InterruptedException{

            List<WebElement> weList = null;
            weList =  driver.findElements(By.className(className));
            for (WebElement we : weList) {
                if(we.getText().contains(text)){
                    we.click();
                    break;
                }
            }           
        }
        
        public void sendKeys(String className ,String text, String input) throws InterruptedException{

            List<WebElement> weList = null;
            weList =  driver.findElements(By.className(className));
            for (WebElement we : weList) {
                if(we.getText().contains(text)){
                    we.sendKeys(input);;
                    break;
                }
            }           
        }
}