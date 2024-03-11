import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mytestcases {
	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void MySetUp() throws InterruptedException {
		String myURL = "https://www.saucedemo.com/";
		driver.get(myURL);
		
	}
	@Test
	public void Login() throws InterruptedException {
	WebElement username= driver.findElement(By.id("user-name"));
	WebElement password=	driver.findElement(By.id("password"));
	WebElement login =	driver.findElement(By.id("login-button"));

		username.sendKeys("standard_user");
	    password.sendKeys("secret_sauce");
		login.click();
		WebElement firstitemaddtocart= driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		firstitemaddtocart.click();
	}
	@AfterTest
	public void Aftertesting() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
		
	}

}
