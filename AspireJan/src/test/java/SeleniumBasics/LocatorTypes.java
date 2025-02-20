package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorTypes {

	WebDriver driver;

	@Test
	public void f() {
		String sysdirectory = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.com/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// your name
		driver.findElement(By.id("ap_customer_name")).sendKeys("guruqa");

		// Mobile number or email
		driver.findElement(By.name("email")).sendKeys("pguruqa@gmail.com");

		// Password

		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Admin@123");

		// Re-enter password
		driver.findElement(By.xpath("//*[@id=\"ap_password_check\"]")).sendKeys("Admin@123");

		// partial linktest
		// privacy notice
		WebElement e1 = driver.findElement(By.partialLinkText("Privacy Notice"));
		System.out.println("link present or not" + e1.isDisplayed());

		WebElement e2 = driver.findElement(By.linkText("Create a free business account"));

		System.out.println("free business accoun link present or not" + e2.isDisplayed());

		List<WebElement> list = driver.findElements(By.tagName("input"));
		System.out.println("no of input tages in registration page" + list.size());
		
		driver.findElement(By.id("continue")).click();
	}
}
