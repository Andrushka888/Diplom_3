import org.example.LoginPageStellarBurgers;
import org.example.MainPageStellarBurgers;
import org.example.RegistrationPageStellarBurgers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;


public class TestRegistration {
    private String userName;
    private String userEmail;
    private String userPassword;
    private WebDriver driver;

    @Before
    public void preparatoryDataForTestRegistration() {
        driver = new ChromeDriver();
        driver.get("https://stellarburgers.nomoreparties.site/");
    }

    @Test
    public void testSuccessfulRegistrationAndAppearancesTextAboutPasswordRecoveryInChrome() {

        MainPageStellarBurgers objMainPage = new MainPageStellarBurgers(driver);
        LoginPageStellarBurgers objLoginPage = new LoginPageStellarBurgers(driver);
        RegistrationPageStellarBurgers objRegistrationPage = new RegistrationPageStellarBurgers(driver);
        userName = "Test User36";
        userEmail = "TestChelForUi36@mail.ru";
        userPassword = "123456789";

        objMainPage.clickLkButtonInHeader();
        objLoginPage.clickRegistrationButtonInLoginPage();
        objRegistrationPage.setName(userName);
        objRegistrationPage.setEmail(userEmail);
        objRegistrationPage.setPassword(userPassword);

        objRegistrationPage.clickRegistrationButtonInRegistrationPage();

        String actualForgetPasswordText = objLoginPage.getForgetPassword();

        String expectedEnterText = "Забыли пароль? Восстановить пароль";
        assertEquals("Должна появиться кнопка 'Забыли пароль? Восстановить пароль'", expectedEnterText, actualForgetPasswordText);

    }

    @Test
    public void testNotCorrectRegistrationIfPasswordNotCorrectInChrome() {

        MainPageStellarBurgers objMainPage = new MainPageStellarBurgers(driver);
        LoginPageStellarBurgers objLoginPage = new LoginPageStellarBurgers(driver);
        RegistrationPageStellarBurgers objRegistrationPage = new RegistrationPageStellarBurgers(driver);
        userName = "Test User32";
        userEmail = "TestChelForUi32@mail.ru";
        userPassword = "123";

        objMainPage.clickLkButtonInHeader();
        objLoginPage.clickRegistrationButtonInLoginPage();
        objRegistrationPage.setName(userName);
        objRegistrationPage.setEmail(userEmail);
        objRegistrationPage.setPassword(userPassword);

        objRegistrationPage.clickRegistrationButtonInRegistrationPage();

        String actualForgetPasswordText = objRegistrationPage.getIncorrectPasswordText();

        String expectedEnterText = "Некорректный пароль";
        assertEquals("Должна появиться надпись 'Некорректный пароль'", expectedEnterText, actualForgetPasswordText);
    }

    @After
    public void teardown() {
        // Закрыть браузер
        driver.quit();
    }
}
