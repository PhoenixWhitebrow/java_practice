package pw.tests.addressbook.tests;

import org.junit.Test;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() {
    app.goToGroups();
    app.selectGroup();
    app.deleteSelectedGroups();
    app.returnToGroups();
  }
}
