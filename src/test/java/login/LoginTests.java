package login;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTests extends BaseTests {

    @Test
    public void testSucessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUserAndPassword("tomsmith","SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        Assert.assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"), "The text is not correct");
    }
}
