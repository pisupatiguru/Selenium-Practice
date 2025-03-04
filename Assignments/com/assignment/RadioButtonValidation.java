package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RadioButtonValidation {
	Webdriver driver;

	@Test
	public void f() {

//		URL:  https://leafground.com/radio.xhtml 
//			---Find the default select radio button (Chrome radio button click) 
//			---Select the age group (only if not selected) (select the radio button 41-60) years 

		String sysdirectory = System.getProperty("user.dir");
		System.out.println("current dir" + sysdirectory);
		System.setProperty("webdriver.chrome.drive", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.findElements("")
		Select obj = new Select(driver.findElement(By.id("cars")));
//		---Find the default select radio button (Chrome radio button click) 
		
//		---Select the age group (only if not selected) (select the radio button 41-60) years 

	}
}
