package pw.tests.addressbook.tests;

import org.junit.Test;
import pw.tests.addressbook.model.ContactData;
import pw.tests.addressbook.model.Date;

public class ContactCreationTests extends TestBase {
  @Test
  public void testContactCreation() {

    ContactData contactData = new ContactData();
    contactData.firstName = "fName";
    contactData.middleName = "mName";
    contactData.lastName = "lName";
    contactData.nickname = "nName";
    contactData.title = "title";
    contactData.company = "company";
    contactData.address = "address";
    contactData.phoneHome = "phoneHome";
    contactData.phoneMobile = "phoneMobile";
    contactData.phoneWork = "phoneWork";
    contactData.fax = "fax";
    contactData.email = "email@test.tt";
    contactData.email2 = "email2@test.tt";
    contactData.email3 = "email3@test.tt";
    contactData.homepage = "homepage";
    contactData.birthday = new Date(29, 11, 1991);
    contactData.anniversary = new Date(14, 5, 2024);
    contactData.group = "test1";
    contactData.address2 = "address2";
    contactData.phone2 = "phone2";
    contactData.notes = "notes";

    app.getNavigationHelper().goToHomePage();
    app.getContactHelper().createContact(contactData, true);
  }
}