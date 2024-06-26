package pw.tests.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pw.tests.addressbook.model.GroupData;

public class GroupHelper extends HelperBase {
  // Delegation constructor
  public GroupHelper(WebDriver driver) {
    super(driver);
  }

  public void initGroupCreation() {
    click(By.xpath("//input[@name='new']"));
  }

  public void fillGroupForm(GroupData groupData) {
    type(By.xpath("//input[@name='group_name']"), groupData.getName());
    type(By.xpath("//textarea[@name='group_header']"), groupData.getHeader());
    type(By.xpath("//textarea[@name='group_footer']"), groupData.getFooter());
  }

  public void submitGroupCreation() {
    click(By.xpath("//input[@name='submit']"));
  }

  public void returnToGroups() {
    click(By.xpath("//a[contains(text(),'group page')]"));
  }

  public void selectGroup() {
    click(By.xpath("//input[@name='selected[]']"));
  }

  public void deleteSelectedGroups() {
    click(By.xpath("(//input[@name='delete'])[2]"));
  }

  public void initGroupModification() {
    click(By.xpath("(//input[@name='edit'])[2]"));
  }

  public void submitGroupModification() {
    click(By.xpath("//input[@name='update']"));
  }

  public void createGroup(GroupData groupData) {
    initGroupCreation();
    fillGroupForm(groupData);
    submitGroupCreation();
    returnToGroups();
  }

  public boolean isThereAGroup() {
    return isElementPresent(By.xpath("//input[@name='selected[]']"));
  }
}
