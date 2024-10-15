package PagesTest;

import Pages.PimPAGE;
import Pages.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class PimPageTest extends BaseTest {
    private String firstname;
    private String middleName;
    private String lastname;
    private String employeeID;
    private String username1;
    private String password1;
    private String confirmPassword1;
    private PimPAGE adminPage;
    @Test
    public void testAdmin() throws InterruptedException, IOException {
        PimPAGE pim = new PimPAGE();
        pim.openPimTab();
        pim.navigateToAddEmployee();
        pim.enterFirstName(firstname);
        pim.enterMiddleName(middleName);
        pim.enterLastName(lastname);
        pim.enterEmployeeID(employeeID);
        pim.clickOnRadioButton();
        pim.enterUsernameToVerifyLogin(username1);
        pim.enterPasswordToVerifyLogin(password1);
        pim.confirmPasswordToVerifyLogin(confirmPassword1);
        pim.clickSaveButton();

    }

}
