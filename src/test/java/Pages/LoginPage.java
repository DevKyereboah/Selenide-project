package Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
public class LoginPage {
      SelenideElement usernameField =
            Selenide.$(By.xpath("//div//input[@name='username']"));

     SelenideElement passwordField =
            Selenide.$(By.xpath("//input[@placeholder='Password']"));

     SelenideElement submitButton =
            Selenide.$(By.xpath("//button[normalize-space()='Login']"));

    SelenideElement adminTabElement =
            Selenide.$(By.xpath("//i[@class='oxd-icon bi-gear-fill orangehrm-leave-card-icon']"));

     //Methods to interact with the page
    public void enterUsername(String username){
        System.out.println("username: " + username);
        usernameField.val(username);
    }
    public void enterPassword(String password){
        System.out.println("password"+ password);
        passwordField.val(password);
    }

    public void clickSubmitButton(){
        submitButton.click();
    }

}