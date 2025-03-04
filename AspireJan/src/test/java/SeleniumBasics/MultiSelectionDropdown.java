package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MultiSelectionDropdown {
	WebDriver driver;

	@Test
	public void f() throws InterruptedException {
		String sysdirectory = System.getProperty("user.dir");
		System.out.println("current dir" + sysdirectory);
		System.setProperty("webdriver.chrome.drive", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Select obj = new Select(driver.findElement(By.id("cars")));

		obj.selectByValue("volvo");
		obj.selectByValue("saab");
		obj.selectByValue("opel");
		System.out.println("Is multiple :::" + obj.isMultiple());
		Thread.sleep(2000);
		obj.deselectAll();
		Thread.sleep(2000);
		driver.quit();
	}
}
