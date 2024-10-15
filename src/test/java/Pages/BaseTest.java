package Pages;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import static com.codeborne.selenide.WebDriverRunner.url;

public class BaseTest {
    protected LoginPage loginPage;
     protected String url;
    @BeforeMethod
    public void setUp() throws IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("src/main/resources/testdata.properties");
        properties.load(fileInputStream);
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        loginPage = new LoginPage();
        Selenide.open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        this.url = url();
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickSubmitButton();
        Selenide.sleep(10000);
    }
}
