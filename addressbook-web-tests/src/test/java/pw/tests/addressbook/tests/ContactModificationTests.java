package pw.tests.addressbook.tests;

import org.junit.Test;
import pw.tests.addressbook.model.ContactData;
import pw.tests.addressbook.model.Date;

public class ContactModificationTests extends TestBase {
  @Test
  public void testContactModification() {

    ContactData contactData = new ContactData();
    contactData.firstName = "fName_mod";
    contactData.middleName = "mName_mod";
    contactData.lastName = "lName_mod";
    contactData.nickname = "nName_mod";
    contactData.title = "title_mod";
    contactData.company = "company_mod";
    contactData.address = "address_mod";
    contactData.phoneHome = "phoneHome_mod";
    contactData.phoneMobile = "phoneMobile_mod";
    contactData.phoneWork = "phoneWork_mod";
    contactData.fax = "fax_mod";
    contactData.email = "email_mod@test.tt";
    contactData.email2 = "email2_mod@test.tt";
    contactData.email3 = "email3_mod@test.tt";
    contactData.homepage = "homepage_mod";
    contactData.birthday = new Date(30, 12, 1992);
    contactData.anniversary = new Date(15, 5, 2024);
    contactData.address2 = "address2_mod";
    contactData.phone2 = "phone2_mod";
    contactData.notes = "notes_mod";

    app.getNavigationHelper().goToHomePage();
    if (!app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("fName", "lName", "phoneMobile", "email@test.tt"), true);
    }
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(contactData, false);
    app.getContactHelper().submitContactModification();
    app.getContactHelper().returnToHomePage();
  }
}
