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

    public void submitGroupForm() {
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

}
