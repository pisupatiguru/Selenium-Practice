package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectDropdownsingle {
	WebDriver driver;

	@Test
	public void f() throws InterruptedException {
		String sysdirectory = System.getProperty("user.dir");
		System.out.println("current dir" + sysdirectory);
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		Select sel = new Select(driver.findElement(By.id("dropdown")));
		sel.selectByValue("2");
		Thread.sleep(2000);
		sel.selectByVisibleText("Option 1");
		Thread.sleep(2000);
		boolean muloption = sel.isMultiple();
		System.out.println("is multi select :- " + muloption);
		Thread.sleep(2000);
		driver.quit();

	}
}
