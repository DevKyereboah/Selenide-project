package Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.codeborne.selenide.WebDriverRunner.url;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class PimPAGE {
    SelenideElement pimTabElement =
            $(By.xpath("//span[normalize-space()='PIM']"));
    SelenideElement addEmployeeTab =
            $(By.xpath("//a[normalize-space()='Add Employee']"));

    // From field
    SelenideElement headerVisibility =
            $(By.xpath("//h6[normalize-space()='Add Employee']"));

    SelenideElement firstName =
            $(By.xpath("//input[@placeholder='First Name']"));

    SelenideElement middlename =
            $(By.xpath("//input[@placeholder='Middle Name']"));
    SelenideElement lastname =
            $(By.xpath("//input[@placeholder='Last Name']"));
    SelenideElement employeeId =
            $(By.xpath("(//div//input[@class='oxd-input oxd-input--active'])[2]"));
    SelenideElement clickRadioButton =
            $(By.cssSelector(".oxd-switch-input.oxd-switch-input--active.--label-right"));
    SelenideElement enterUsername1 =
            $(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]"));
    SelenideElement enterPassword1 =
            $(By.xpath("(//input[@type='password'])[1]"));
    SelenideElement confirmPassword1 =
            $(By.xpath("(//input[@type='password'])[2]"));
    SelenideElement clickSaveButton =
            $(By.xpath("//button[normalize-space()='Save']"));

    public void openPimTab() {
        pimTabElement.shouldBe(visible).click();

        // Optionally confirm URL or element state change
        Selenide.sleep(2000);
        System.out.println("Current URL: " + url());
    }

    public void navigateToAddEmployee() {
        String addEmployeeText = addEmployeeTab.getText();
        System.out.println(addEmployeeText);
        addEmployeeTab.click();
        Selenide.sleep(3000);
    }

    public void verifyHeaderVisibility() {
        headerVisibility.should(visible);
        Selenide.sleep(5000);
    }

    public void enterFirstName(String firstNameInput) throws IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("src/main/resources/testdata.properties");
        properties.load(fileInputStream);
        String firstname = properties.getProperty("firstname");
        firstName.val(firstname);
        Selenide.sleep(3000);
    }

    public void enterMiddleName(String middleNameInput) throws IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("src/main/resources/testdata.properties");
        properties.load(fileInputStream);
        String middleName = properties.getProperty("middleName");
        middlename.val(middleName);
    }

    public void enterLastName(String lastNameInput) throws IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("src/main/resources/testdata.properties");
        properties.load(fileInputStream);
        String lastName = properties.getProperty("lastname");
        lastname.val(lastName);
    }

    public void enterEmployeeID(String employeeIDInput) throws IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("src/main/resources/testdata.properties");
        properties.load(fileInputStream);
        String employeeID = properties.getProperty("employeeID");
        employeeId.val(employeeID);
    }

    public void clickOnRadioButton() {
        clickRadioButton.click();
        Selenide.sleep(3000);
    }

    public void enterUsernameToVerifyLogin(String usernameInput1) throws IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("src/main/resources/testdata.properties");
        properties.load(fileInputStream);
        String userName = properties.getProperty("username1");
        enterUsername1.val(userName);
    }

    public void enterPasswordToVerifyLogin(String password1) throws IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("src/main/resources/testdata.properties");
        properties.load(fileInputStream);
        String password = properties.getProperty("password1");
        enterPassword1.val(password);
    }

    public void confirmPasswordToVerifyLogin(String reEnterPassword) throws IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("src/main/resources/testdata.properties");
        properties.load(fileInputStream);
        String confirmPassword = properties.getProperty("password1");
        confirmPassword1.val(confirmPassword);
    }

    public void clickSaveButton() {
        clickSaveButton.click();
        Selenide.sleep(10000);
    }

}


