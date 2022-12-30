package Blasters.Akash;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class BaseClass {

    public WebDriver driver;


    @Test
    public void initBrowser() throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(readProperty("URL"));

    }

    public void screenShot() throws IOException {
        String date = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\ecommerce-flipkart\\src\\main\\java\\Blasters\\Akash\\screenshots_Test" + date + ".jpg");
        FileUtils.copyFile(source, destination);
    }

    public static String readProperty(String key) throws InterruptedException, IOException {
        FileInputStream fin = new FileInputStream("C:\\ecommerce-flipkart\\src\\main\\java\\Blasters\\Akash\\config.properties");
        Properties prop = new Properties();
        prop.load(fin);
        String value = prop.getProperty(key);
        return (value);
    }
}
