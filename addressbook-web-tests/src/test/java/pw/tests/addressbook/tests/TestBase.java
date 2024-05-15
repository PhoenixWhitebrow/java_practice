package pw.tests.addressbook.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.Browser;
import pw.tests.addressbook.appmanager.ApplicationManager;

public class TestBase {

    // Delegation class declaration and initialisation
    protected final ApplicationManager app = new ApplicationManager(Browser.CHROME);

    @Before
    public void setUp() {
        app.init();
    }

    @After
    public void tearDown() {
        app.stop();
    }

}
