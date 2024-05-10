package pw.tests.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper {
    private WebDriver driver;
    // Delegation constructor
    public SessionHelper(WebDriver driver){
        this.driver = driver;
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

}
