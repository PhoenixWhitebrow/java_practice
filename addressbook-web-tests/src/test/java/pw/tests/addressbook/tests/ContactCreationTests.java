package pw.tests.addressbook.tests;

import org.junit.Test;
import pw.tests.addressbook.model.ContactData;
import pw.tests.addressbook.model.Date;

public class ContactCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {

        ContactData contactData = new ContactData();
        contactData.firstName = "firstName";
        contactData.middleName = "middleName";
        contactData.lastName = "lastName";
        contactData.nickname = "nickname";
        contactData.title = "title";
        contactData.company = "company";
        contactData.address = "address";
        contactData.phoneHome = "phoneHome";
        contactData.phoneMobile = "phoneMobile";
        contactData.phoneWork = "phoneWork";
        contactData.fax = "fax";
        contactData.email = "email";
        contactData.email2 = "email2";
        contactData.email3 = "email3";
        contactData.homepage = "homepage";
        contactData.birthday = new Date(29, 11, 1991);
        contactData.anniversary = new Date(14, 5, 2024);
        contactData.group = "[none]";
        contactData.address2 = "address2";
        contactData.phone2 = "phone2";
        contactData.notes = "notes";

        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(contactData);
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToHomePage();
    }
}
