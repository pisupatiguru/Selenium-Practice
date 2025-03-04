package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButtonVaidation {
	WebDriver driver;

	@Test
	public void f() {
		String sysdirectory = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.findElement(By.xpath("//*[@id=\"j_idt87:console1\"]/tbody/tr/td[4]/div/div[2]")).click();
		WebElement e2 = driver.findElement(By.xpath("//*[@id=\"j_idt87:console1\"]/tbody/tr/td[4]/div/div[2]"));
		System.out.println("element enabled or not " + e2.isEnabled());
		Thread.sleep(10000);
		driver.quit();
	}
}
