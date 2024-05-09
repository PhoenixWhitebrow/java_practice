package pw.tests.addressbook;
// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;
import java.util.*;

public class GroupCreationTests {
  private WebDriver driver;
    JavascriptExecutor js;

  @Before
  public void setUp() {
    // Browser driver
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
      Map<String, Object> vars = new HashMap<String, Object>();
    // Timeouts
    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
            .withTimeout(Duration.ofSeconds(30))
            .pollingEvery(Duration.ofSeconds(5))
            .ignoring(NoSuchElementException.class);
    // Open addressbook
    driver.get("http://ab.localhost/index.php");
    driver.manage().window().setSize(new Dimension(800, 600));
    login("admin", "secret");
  }

  @Test
  public void testGroupCreation() {
    goToGroups();
    initGruopCreation();
    fillGroupForm(new GroupData("test1", "test2", "test3"));
    submitGroupForm();
    goToGroups();
  }

  private void login(String username, String password) {
    driver.findElement(By.xpath("//*[@id=\"LoginForm\"]/input[1]")).click();
    driver.findElement(By.xpath("//*[@id=\"LoginForm\"]/input[1]")).clear();
    driver.findElement(By.xpath("//*[@id=\"LoginForm\"]/input[1]")).sendKeys(username);
    driver.findElement(By.xpath("//*[@id=\"LoginForm\"]/input[2]")).click();
    driver.findElement(By.xpath("//*[@id=\"LoginForm\"]/input[2]")).clear();
    driver.findElement(By.xpath("//*[@id=\"LoginForm\"]/input[2]")).sendKeys(password);
    driver.findElement(By.xpath("//*[@id=\"LoginForm\"]/input[3]")).click();
  }

  private void goToGroups() {
    driver.findElement(By.linkText("groups")).click();
  }

  private void initGruopCreation() {
    driver.findElement(By.xpath("//*[@id=\"content\"]/form/input[1]")).click();
  }

  private void fillGroupForm(GroupData groupData) {
    driver.findElement(By.xpath("//*[@id=\"content\"]/form/input[1]")).click();
    driver.findElement(By.xpath("//*[@id=\"content\"]/form/input[1]")).clear();
    driver.findElement(By.xpath("//*[@id=\"content\"]/form/input[1]")).sendKeys(groupData.getName());
    driver.findElement(By.xpath("//*[@id=\"content\"]/form/textarea[1]")).click();
    driver.findElement(By.xpath("//*[@id=\"content\"]/form/textarea[1]")).clear();
    driver.findElement(By.xpath("//*[@id=\"content\"]/form/textarea[1]")).sendKeys(groupData.getHeader());
    driver.findElement(By.xpath("//*[@id=\"content\"]/form/textarea[2]")).click();
    driver.findElement(By.xpath("//*[@id=\"content\"]/form/textarea[2]")).clear();
    driver.findElement(By.xpath("//*[@id=\"content\"]/form/textarea[2]")).sendKeys(groupData.getFooter());
  }

  private void submitGroupForm() {
    driver.findElement(By.xpath("//*[@id=\"content\"]/form/input[2]")).click();
  }

  @After
  public void tearDown() {
    driver.quit();
  }
}
