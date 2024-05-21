package pw.tests.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase{
  // Delegation constructor
  public NavigationHelper(WebDriver driver){
    super(driver);
  }

  public void goToGroupPage() {
    if (isElementPresent(By.tagName("h1"))
        && driver.findElement(By.tagName("h1")).getText().equals("Groups")
        && isElementPresent(By.xpath("//input[@name='new']"))) {
      return;
    } else {
      click(By.xpath("//a[contains(text(),'groups')]"));
    }
  }

  public void goToHomePage() {
    if (isElementPresent(By.xpath("//*[@id=\"maintable\"]"))) {
      return;
    } else {
      click(By.xpath("//a[contains(text(),'home')]"));
    }
  }
}
