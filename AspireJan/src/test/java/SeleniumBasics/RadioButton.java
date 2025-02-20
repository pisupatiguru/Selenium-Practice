package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButton {
	WebDriver driver;

	@Test
	public void f() throws InterruptedException {
		String sysdirectory = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://leafground.com/radio.xhtml");
		driver.findElement(By.xpath("//*[@id=\"j_idt87:console1\"]/tbody/tr/td[4]/div/div[2]")).click();
		WebElement e2 = driver.findElement(By.xpath("//*[@id=\"j_idt87:console1\"]/tbody/tr/td[4]/div/div[2]"));
		System.out.println("element enabled or not " + e2.isEnabled());
		Thread.sleep(10000);
		driver.quit();
	}
}
