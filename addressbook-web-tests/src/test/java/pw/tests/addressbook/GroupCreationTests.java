package pw.tests.addressbook;

import org.junit.Test;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    goToGroups();
    initGruopCreation();
    fillGroupForm(new GroupData("test1", "test2", "test3"));
    submitGroupForm();
    returnToGroups();
  }

}
