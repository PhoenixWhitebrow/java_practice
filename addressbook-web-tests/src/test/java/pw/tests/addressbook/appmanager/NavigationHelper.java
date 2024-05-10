package pw.tests.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper {
    private WebDriver driver;
    // Delegation constructor
    public NavigationHelper(WebDriver driver){
        this.driver = driver;
    }

    public void goToGroupPage() {
      driver.findElement(By.xpath("//a[contains(text(),'groups')]")).click();
    }
}
