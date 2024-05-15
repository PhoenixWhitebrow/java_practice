package pw.tests.addressbook.tests;

import org.junit.Test;
import pw.tests.addressbook.model.ContactData;
import pw.tests.addressbook.model.Date;

public class ContactModificationTests extends TestBase {
    @Test
    public void testContactModification() {

        ContactData contactData = new ContactData();
        contactData.firstName = "fName_modified";
        contactData.middleName = "mName_modified";
        contactData.lastName = "lName_modified";
        contactData.nickname = "nName_modified";
        contactData.title = "title_modified";
        contactData.company = "company_modified";
        contactData.address = "address_modified";
        contactData.phoneHome = "phoneHome_modified";
        contactData.phoneMobile = "phoneMobile_modified";
        contactData.phoneWork = "phoneWork_modified";
        contactData.fax = "fax_modified";
        contactData.email = "email_modified";
        contactData.email2 = "email2_modified";
        contactData.email3 = "email3_modified";
        contactData.homepage = "homepage_modified";
        contactData.birthday = new Date(30, 12, 1992);
        contactData.anniversary = new Date(15, 5, 2024);
        // contactData.group = "name modified";
        contactData.address2 = "address2_modified";
        contactData.phone2 = "phone2_modified";
        contactData.notes = "notes_modified";

        app.getNavigationHelper().goToHomePage();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(contactData);
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToHomePage();
    }
}
