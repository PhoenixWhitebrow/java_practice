package pw.tests.addressbook;

import org.junit.Test;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() {
    goToGroups();
    selectGroup();
    deleteSelectedGroups();
    returnToGroups();
  }

}
