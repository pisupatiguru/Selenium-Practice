package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownList {
	WebDriver driver;

	@Test
	public void f() throws InterruptedException {
		String sysdirectory = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");

		Select sel = new Select(driver.findElement(By.id("dropdown")));
		sel.selectByIndex(1);
		Thread.sleep(5000);
//		sel.selectByIndex(1);
//		Thread.sleep(5000);

	}

}
