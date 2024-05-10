package pw.tests.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import pw.tests.addressbook.model.GroupData;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class ApplicationManager {
    JavascriptExecutor js;
    private WebDriver driver;

    public void init() {
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

    public void stop() {
        driver.quit();
    }

    public void login(String username, String password) {
      driver.findElement(By.xpath("//input[@name='user']")).click();
      driver.findElement(By.xpath("//input[@name='user']")).clear();
      driver.findElement(By.xpath("//input[@name='user']")).sendKeys(username);
      driver.findElement(By.xpath("//input[@name='pass']")).click();
      driver.findElement(By.xpath("//input[@name='pass']")).clear();
      driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
      driver.findElement(By.xpath("//*[@id=\"LoginForm\"]/input[3]")).click();
    }

    public void goToGroups() {
      driver.findElement(By.xpath("//a[contains(text(),'groups')]")).click();
    }

    public void initGruopCreation() {
      driver.findElement(By.xpath("//input[@name='new']")).click();
    }

    public void fillGroupForm(GroupData groupData) {
      driver.findElement(By.xpath("//input[@name='group_name']")).click();
      driver.findElement(By.xpath("//input[@name='group_name']")).clear();
      driver.findElement(By.xpath("//input[@name='group_name']")).sendKeys(groupData.getName());
      driver.findElement(By.xpath("//textarea[@name='group_header']")).click();
      driver.findElement(By.xpath("//textarea[@name='group_header']")).clear();
      driver.findElement(By.xpath("//textarea[@name='group_header']")).sendKeys(groupData.getHeader());
      driver.findElement(By.xpath("//textarea[@name='group_footer']")).click();
      driver.findElement(By.xpath("//textarea[@name='group_footer']")).clear();
      driver.findElement(By.xpath("//textarea[@name='group_footer']")).sendKeys(groupData.getFooter());
    }

    public void submitGroupForm() {
      driver.findElement(By.xpath("//input[@name='submit']")).click();
    }

    public void returnToGroups() {
        driver.findElement(By.xpath("//a[contains(text(),'group page')]")).click();
    }

    public void selectGroup() {
        driver.findElement(By.xpath("//input[@name='selected[]']")).click();
    }

    public void deleteSelectedGroups() {
      driver.findElement(By.xpath("(//input[@name='delete'])[2]")).click();
    }
}
