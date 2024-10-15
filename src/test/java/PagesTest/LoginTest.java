package PagesTest;

import Pages.BaseTest;
import Pages.LoginPage;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.testng.AssertJUnit.assertEquals;

public class LoginTest extends BaseTest {
    private String username;
    private String password;
    public LoginPage loginPage;

    @Test
    public void loginTest(){
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickSubmitButton();
        Selenide.sleep(3000);

        // Verify that the user is logged in
        String currentUrl = url();
        String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        Assert.assertEquals(expectedUrl, currentUrl);
        Selenide.sleep(5000);


    }
}


