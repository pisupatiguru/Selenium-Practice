package com.hclpages.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.hclpages.utilities.LoggerUtil;

import java.util.List;

public class MenuPage extends BasePage {
    private static final LoggerUtil loggerUtil = new LoggerUtil();
    private static final org.slf4j.Logger log = loggerUtil.getLogger(MenuPage.class);
    private final By menuItemsLocator = By.cssSelector("nav ul li a");

    public MenuPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getMenuItems() {
        log.info("Finding menu items.");
        return driver.findElements(menuItemsLocator);
    }

    public List<String> getMenuItemTexts() {
        log.info("Extracting menu item texts.");
        return getMenuItems().stream().map(WebElement::getText).toList();
    }

    public void clickMenuItem(String menuItemText) {
        log.info("Clicking menu item: {}", menuItemText);
        List<WebElement> menuItems = getMenuItems();
        for (WebElement menuItem : menuItems) {
            if (menuItem.getText().equals(menuItemText)) {
                menuItem.click();
                return;
            }
        }
        throw new IllegalArgumentException("Menu item '" + menuItemText + "' not found.");
    }
}
