package pw.tests.addressbook.appmanager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;
import java.util.Map;
import java.util.HashMap;
import java.util.NoSuchElementException;
import org.openqa.selenium.Dimension;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

public class ApplicationManager {

    private WebDriver driver;
    JavascriptExecutor js;

    // Constructor
    private Browser browser;
    public ApplicationManager(Browser browser) {
        this.browser = browser;
    }

    // Delegation classes declaration
    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    private ContactHelper contactHelper;

    public void init() {
        // Browser driver
        if (browser == Browser.FIREFOX) {
            driver = new FirefoxDriver();
        } else if (browser == Browser.CHROME) {
            driver = new ChromeDriver();
        } else if (browser == Browser.SAFARI) {
            driver = new SafariDriver();
        }
        js = (JavascriptExecutor) driver;
        Map<String, Object> vars = new HashMap<String, Object>();
        // Timeouts
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        // Delegation classes initialisation
        sessionHelper = new SessionHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        groupHelper = new GroupHelper(driver);
        contactHelper = new ContactHelper(driver);
        // Open addressbook
        driver.get("http://ab.localhost/index.php");
        //driver.manage().window().setSize(new Dimension(1024, 768));
        sessionHelper.login("admin", "secret");
    }

    public void stop() {
        driver.quit();
    }

    //Delegation methods declaration
    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }
}
