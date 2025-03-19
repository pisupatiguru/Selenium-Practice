/**
 * 
 */
package com.hclpages.testCases;

import static org.testng.Assert.assertTrue;

import java.util.Map;

import org.testng.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hclpages.pageObjects.MenuPage;
import com.hclpages.utilities.ConfigReader;
import com.hclpages.utilities.ExcelReader;
import com.hclpages.utilities.LoggerUtil;
import com.hclpages.utilities.ScreenshotUtil;




public class MenuTest {
	private WebDriver driver;
	private MenuPage menuPage;
	private static final LoggerUtil loggerUtil = new LoggerUtil();
	private static final org.slf4j.Logger log = loggerUtil.getLogger(MenuTest.class);

	private Map<String, String> testData;

	@BeforeMethod
	public void setUp() {
		// ... WebDriver setup ...
		driver.get(ConfigReader.getProperty("baseUrl"));
		menuPage = new MenuPage(driver);
		testData = ExcelReader.getTestData("src/test/resources/testdata.xlsx", "Sheet1", 1); // Row 1 is the second row
																								// of the excel sheet.
	}

	@AfterMethod
	public void tearDown() {
		ScreenshotUtil.takeScreenshot(driver, "testResult");
		if (driver != null) {
			driver.quit();
		}
	}

	@Test
	public void testMenuItemsExtraction() {
		log.info("Starting testMenuItemsExtraction");
		assertTrue(menuPage.getMenuItemTexts().size() > 0, "Menu items should not be empty");
		log.info("Finished testMenuItemsExtraction");
	}

	@Test
	public void testClickMenuItem() {
		log.info("Starting testClickMenuItem");
		menuPage.clickMenuItem(testData.get("menuItemToClick"));
		assertTrue(driver.getCurrentUrl().contains("about-us"), "URL should contain 'about-us'");
		log.info("Finished testClickMenuItem");
	}
}
