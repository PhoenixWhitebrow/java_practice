package pw.tests.addressbook.model;

public class ContactData {
  public /*final*/ String firstName;
  public /*final*/ String middleName;
  public /*final*/ String lastName;
  public /*final*/ String nickname;
  public /*final*/ String title;
  public /*final*/ String company;
  public /*final*/ String address;
  public /*final*/ String phoneHome;
  public /*final*/ String phoneMobile;
  public /*final*/ String phoneWork;
  public /*final*/ String fax;
  public /*final*/ String email;
  public /*final*/ String email2;
  public /*final*/ String email3;
  public /*final*/ String homepage;
  public /*final*/ Date birthday;
  public /*final*/ Date anniversary;
  public /*final*/ String group;
  public /*final*/ String address2;
  public /*final*/ String phone2;
  public /*final*/ String notes;

/*    public ContactData(String firstName, String middleName, String lastName, String nickname, String title, String company, String address, String phoneHome, String phoneMobile, String phoneWork, String fax, String email, String email2, String email3, String homepage, Date birthday, Date anniversary, String group, String address2, String phone2, String notes) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.nickname = nickname;
        this.title = title;
        this.company = company;
        this.address = address;
        this.phoneHome = phoneHome;
        this.phoneMobile = phoneMobile;
        this.phoneWork = phoneWork;
        this.fax = fax;
        this.email = email;
        this.email2 = email2;
        this.email3 = email3;
        this.homepage = homepage;
        this.birthday = birthday;
        this.anniversary = anniversary;
        this.group = group;
        this.address2 = address2;
        this.phone2 = phone2;
        this.notes = notes;
    } */

  public String getFirstName() {
    return firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getNickname() {
    return nickname;
  }

  public String getTitle() {
    return title;
  }

  public String getCompany() {
    return company;
  }

  public String getAddress() {
    return address;
  }

  public String getPhoneHome() {
    return phoneHome;
  }

  public String getPhoneMobile() {
    return phoneMobile;
  }

  public String getPhoneWork() {
    return phoneWork;
  }

  public String getFax() {
    return fax;
  }

  public String getEmail() {
    return email;
  }

  public String getEmail2() {
    return email2;
  }

  public String getEmail3() {
    return email3;
  }

  public String getHomepage() {
    return homepage;
  }

  public Date getBirthday() {
    return birthday;
  }

  public Date getAnniversary() {
    return anniversary;
  }

  public String getGroup() {
    return group;
  }

  public String getAddress2() {
    return address2;
  }

  public String getPhone2() {
    return phone2;
  }

  public String getNotes() {
    return notes;
  }
}
