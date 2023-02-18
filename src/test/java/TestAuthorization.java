import org.example.LoginPageStellarBurgers;
import org.example.MainPageStellarBurgers;
import org.example.PasswordRecoverPageStellarBurgers;
import org.example.RegistrationPageStellarBurgers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class TestAuthorization {
    private String userEmail;
    private String userPassword;
    private WebDriver driver;

    @Before
    public void preparatoryDataForTestAuthorization() {
        driver = new ChromeDriver();
        driver.get("https://stellarburgers.nomoreparties.site/");
    }

    @Test
    public void testCorrectAuthorizationByButtonInMainPageInChrome() {

        MainPageStellarBurgers objMainPage = new MainPageStellarBurgers(driver);
        LoginPageStellarBurgers objLoginPage = new LoginPageStellarBurgers(driver);

        userEmail = "TestChelForUi@mail.ru";
        userPassword = "123456789";

        objMainPage.clickLkButtonInMainPage();
        objLoginPage.setNameOnAuthorization(userEmail);
        objLoginPage.setPasswordOnAuthorization(userPassword);
        objLoginPage.clickAuthorizationButtonInAuthorizationPage();

        String actualTextFromButtonCreateOrder = objMainPage.getTextFromButtonCreateOrder();
        String expectedEnterText = "Оформить заказ";

        assertEquals("Должна появиться надпись 'Оформить заказ'", expectedEnterText, actualTextFromButtonCreateOrder);
    }

    @Test
    public void testCorrectAuthorizationByButtonInHeaderOfMainPageInChrome() {

        MainPageStellarBurgers objMainPage = new MainPageStellarBurgers(driver);
        LoginPageStellarBurgers objLoginPage = new LoginPageStellarBurgers(driver);

        userEmail = "TestChelForUi@mail.ru";
        userPassword = "123456789";

        objMainPage.clickLkButtonInHeader();
        objLoginPage.setNameOnAuthorization(userEmail);
        objLoginPage.setPasswordOnAuthorization(userPassword);
        objLoginPage.clickAuthorizationButtonInAuthorizationPage();

        String actualTextFromButtonCreateOrder = objMainPage.getTextFromButtonCreateOrder();
        String expectedEnterText = "Оформить заказ";

        assertEquals("Должна появиться надпись 'Оформить заказ'", expectedEnterText, actualTextFromButtonCreateOrder);
    }

    @Test
    public void testCorrectAuthorizationByButtonInFooterInRegistrationPageInChrome() {

        MainPageStellarBurgers objMainPage = new MainPageStellarBurgers(driver);
        LoginPageStellarBurgers objLoginPage = new LoginPageStellarBurgers(driver);
        RegistrationPageStellarBurgers objRegistrationPage = new RegistrationPageStellarBurgers(driver);

        userEmail = "TestChelForUi@mail.ru";
        userPassword = "123456789";

        objMainPage.clickLkButtonInHeader();
        objLoginPage.clickRegistrationButtonInLoginPage();
        objRegistrationPage.clickButtonEnterInFooterInRegistrationPage();

        objLoginPage.setNameOnAuthorization(userEmail);
        objLoginPage.setPasswordOnAuthorization(userPassword);
        objLoginPage.clickAuthorizationButtonInAuthorizationPage();

        String actualTextFromButtonCreateOrder = objMainPage.getTextFromButtonCreateOrder();
        String expectedEnterText = "Оформить заказ";

        assertEquals("Должна появиться надпись 'Оформить заказ'", expectedEnterText, actualTextFromButtonCreateOrder);
    }

    @Test
    public void testCorrectAuthorizationByButtonInFooterInPasswordRecoveryPageInChrome() {

        MainPageStellarBurgers objMainPage = new MainPageStellarBurgers(driver);
        LoginPageStellarBurgers objLoginPage = new LoginPageStellarBurgers(driver);
        PasswordRecoverPageStellarBurgers objPasswordRecoverPage = new PasswordRecoverPageStellarBurgers(driver);

        userEmail = "TestChelForUi@mail.ru";
        userPassword = "123456789";

        objMainPage.clickLkButtonInHeader();
        objLoginPage.clickButtonPasswordRecoverInAuthorizationPage();
        objPasswordRecoverPage.clickButtonEnterInFooterInPasswordRecoverPage();

        objLoginPage.setNameOnAuthorization(userEmail);
        objLoginPage.setPasswordOnAuthorization(userPassword);
        objLoginPage.clickAuthorizationButtonInAuthorizationPage();

        String actualTextFromButtonCreateOrder = objMainPage.getTextFromButtonCreateOrder();
        String expectedEnterText = "Оформить заказ";

        assertEquals("Должна появиться надпись 'Оформить заказ'", expectedEnterText, actualTextFromButtonCreateOrder);
    }

    @After
    public void teardown() {
        // Закрыть браузер
        driver.quit();
    }

}
