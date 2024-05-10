package pw.tests.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pw.tests.addressbook.model.GroupData;

public class GroupHelper {
    private WebDriver driver;
    // Delegation constructor
    public GroupHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void initGruopCreation() {
      driver.findElement(By.xpath("//input[@name='new']")).click();
    }

    public void fillGroupForm(GroupData groupData) {
      driver.findElement(By.xpath("//input[@name='group_name']")).click();
      driver.findElement(By.xpath("//input[@name='group_name']")).clear();
      driver.findElement(By.xpath("//input[@name='group_name']")).sendKeys(groupData.getName());
      driver.findElement(By.xpath("//textarea[@name='group_header']")).click();
      driver.findElement(By.xpath("//textarea[@name='group_header']")).clear();
      driver.findElement(By.xpath("//textarea[@name='group_header']")).sendKeys(groupData.getHeader());
      driver.findElement(By.xpath("//textarea[@name='group_footer']")).click();
      driver.findElement(By.xpath("//textarea[@name='group_footer']")).clear();
      driver.findElement(By.xpath("//textarea[@name='group_footer']")).sendKeys(groupData.getFooter());
    }

    public void submitGroupForm() {
      driver.findElement(By.xpath("//input[@name='submit']")).click();
    }

    public void returnToGroups() {
        driver.findElement(By.xpath("//a[contains(text(),'group page')]")).click();
    }

    public void selectGroup() {
        driver.findElement(By.xpath("//input[@name='selected[]']")).click();
    }

    public void deleteSelectedGroups() {
      driver.findElement(By.xpath("(//input[@name='delete'])[2]")).click();
    }
}
