package Blasters.Akash;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class LoginPage extends BaseClass {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    @Test

    public void Login() throws IOException, InterruptedException {
        driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
        driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys(readProperty("emailId"));
        driver.findElement(By.xpath("//*[@class=\"a-button a-button-span12 a-button-primary\"]")).click();
        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(readProperty("Password"));
        driver.findElement(By.xpath("//input[@tabindex=\"3\"]")).click();
        driver.close();
        driver.quit();
    }
}
