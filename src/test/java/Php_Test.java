import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class Php_Test {
	
	@Test
	public void testPHP() {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Training Assignment\\Selenium\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://192.168.56.102:8090/website/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement link = driver.findElement(By.linkText("About Us"));
		link.isClicked().Error.Error();
		System.out.println(link.isDisplayed());
		Assert.assertTrue(link.isDisplayed(), "link is not displayed");
	}

}
