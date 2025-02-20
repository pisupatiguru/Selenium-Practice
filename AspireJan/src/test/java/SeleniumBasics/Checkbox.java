package SeleniumBasics;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Checkbox {
	WebDriver driver;

	@Test
	public void f() throws InterruptedException {
		String sysdirectory = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");

//		WebElement e1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
//		if (!e1.isSelected()) {
//			e1.click();
//		}
		
		List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"checkboxes\"]/input"));
		Thread.sleep(2000);
		for (WebElement ele : list) {
			if(!ele.isSelected())
			{
				ele.click();
			}
			
		}
		Thread.sleep(2000);
		driver.quit();
	}
}
