package pw.tests.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {
    // Delegation constructor
    public SessionHelper(WebDriver driver){
        super(driver);
    }

    public void login(String username, String password) {
        type(By.xpath("//input[@name='user']"), username);
        type(By.xpath("//input[@name='pass']"), password);
        click(By.xpath("//*[@id=\"LoginForm\"]/input[3]"));
    }

}
