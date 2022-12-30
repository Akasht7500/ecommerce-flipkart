package Blasters.Akash.Test;

import Blasters.Akash.BaseClass;
import Blasters.Akash.LoginPage;
import org.junit.Test;
import java.io.IOException;

public class TestScripts extends BaseClass {
    @Test
    public void cart() throws IOException, InterruptedException {
        initBrowser();
        LoginPage loginPage=new LoginPage(driver);
        loginPage.Login();
    }
}
