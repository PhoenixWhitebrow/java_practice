package pw.tests.addressbook.tests;

import org.junit.Test;
import pw.tests.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().initGruopCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.getGroupHelper().submitGroupForm();
    app.getGroupHelper().returnToGroups();
  }
}
