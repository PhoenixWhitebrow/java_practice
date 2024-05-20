package pw.tests.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase{
  // Delegation constructor
  public NavigationHelper(WebDriver driver){
    super(driver);
  }

  public void goToGroupPage() {
    click(By.xpath("//a[contains(text(),'groups')]"));
  }

  public void goToHomePage() {
    click(By.xpath("//a[contains(text(),'home')]"));
  }
}
