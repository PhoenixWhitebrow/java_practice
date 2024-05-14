package pw.tests.addressbook.tests;

import org.junit.Test;
import pw.tests.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase{

    @Test
    public void testGroupModification() {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("name modified", "header modified", "footer modified"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroups();
    }
}
