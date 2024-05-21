package pw.tests.addressbook.appmanager;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pw.tests.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {
  // Delegation constructor
  public ContactHelper(WebDriver driver) {
    super(driver);
  }

  public void initContactCreation() {
    click(By.xpath("//a[contains(text(),'add new')]"));
  }

  public void fillContactForm(ContactData contactData, boolean isCreation) {

    type(By.xpath("//input[@name='firstname']"), contactData.getFirstName());
    type(By.xpath("//input[@name='middlename']"), contactData.getMiddleName());
    type(By.xpath("//input[@name='lastname']"), contactData.getLastName());
    type(By.xpath("//input[@name='nickname']"), contactData.getNickname());
    type(By.xpath("//input[@name='title']"), contactData.getTitle());
    type(By.xpath("//input[@name='company']"), contactData.getCompany());
    type(By.xpath("//textarea[@name='address']"), contactData.getAddress());
    type(By.xpath("//input[@name='home']"), contactData.getPhoneHome());
    type(By.xpath("//input[@name='mobile']"), contactData.getPhoneMobile());
    type(By.xpath("//input[@name='work']"), contactData.getPhoneWork());
    type(By.xpath("//input[@name='fax']"), contactData.getFax());
    type(By.xpath("//input[@name='email']"), contactData.getEmail());
    type(By.xpath("//input[@name='email2']"), contactData.getEmail2());
    type(By.xpath("//input[@name='email3']"), contactData.getEmail3());
    type(By.xpath("//input[@name='homepage']"), contactData.getHomepage());
    select(By.xpath("//select[@name='bday']"), contactData.getBirthday().day);
    select(By.xpath("//select[@name='bmonth']"), contactData.getBirthday().month);
    type(By.xpath("//input[@name='byear']"), contactData.getBirthday().year);
    select(By.xpath("//select[@name='aday']"), contactData.getAnniversary().day);
    select(By.xpath("//select[@name='amonth']"), contactData.getAnniversary().month);
    type(By.xpath("//input[@name='ayear']"), contactData.getAnniversary().year);
    type(By.xpath("//textarea[@name='address2']"), contactData.getAddress2());
    type(By.xpath("//input[@name='phone2']"), contactData.getPhone2());
    type(By.xpath("//textarea[@name='notes']"), contactData.getNotes());

    if (isCreation) {
      select(By.xpath("//select[@name='new_group']"), contactData.getGroup());
    } else {
      Assert.assertFalse(isElementPresent(By.xpath("//select[@name='new_group']")));
    }
  }

  public void addContactToGroup (ContactData contactData) {
    select(By.xpath("//select[@name='to_group']"), contactData.getGroup());
    click(By.xpath("//input[@name='add']"));
  }

  public void submitContactCreation() {
    click(By.xpath("(//input[@name='submit'])[2]"));
  }

  public void returnToHomePage() {
    click(By.xpath("//a[contains(text(),'home page')]"));
  }

  public void selectContact() {
    click(By.xpath("//input[@name='selected[]']"));
  }

  public void deleteSelectedContacts() {
    click(By.xpath("//input[@value='Delete']"));
    if (isAlertPresent()) {
      acceptAlert();
    } else {
      Assert.assertTrue(isAlertPresent());
    }
  }

  public void initContactModification() {
    click(By.xpath("//img[@title='Edit']"));
  }

  public void submitContactModification() {
    click(By.xpath("(//input[@name='update'])[2]"));
  }

  public void createContact(ContactData contactData, boolean isCreation) {
    initContactCreation();
    fillContactForm(contactData, isCreation);
    submitContactCreation();
    returnToHomePage();
  }

  public boolean isThereAContact() {
    return isElementPresent(By.xpath("//input[@name='selected[]']"));
  }
}
