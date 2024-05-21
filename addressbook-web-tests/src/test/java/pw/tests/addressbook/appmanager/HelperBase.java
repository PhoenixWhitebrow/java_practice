package pw.tests.addressbook.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class HelperBase {
  protected WebDriver driver;

  public HelperBase(WebDriver driver) {
    this.driver = driver;
  }

  protected void click(By locator) {
    driver.findElement(locator).click();
  }

  protected void type(By locator, String text) {
    if (text != null) {
      String existingText = driver.findElement(locator).getAttribute("value");
      if (!text.equals(existingText)) {
        driver.findElement(locator).click();
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
      }
    }
  }

  protected void select(By locator, String option) {
    if (option != null) {
      String existingSelection = driver.findElement(locator).getAttribute("value");
      if (!option.equals(existingSelection)) {
        driver.findElement(locator).click();
        Select dropdown = new Select(driver.findElement(locator));
        dropdown.selectByVisibleText(option);
      }
    }
  }

  protected void acceptAlert() {
    driver.switchTo().alert().accept();
  }

  protected boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException exception) {
      return false;
    }
  }

  protected boolean isElementPresent(By locator) {
    try {
      driver.findElement(locator);
      return true;
    } catch (NoSuchElementException exception) {
      return false;
    }
  }
}
