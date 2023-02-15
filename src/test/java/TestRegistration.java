import org.example.LoginPageStellarBurgers;
import org.example.MainPageStellarBurgers;
import org.example.RegistrationPageStellarBurgers;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


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
    public void checkClickOrderAnyButtonAndFillOrderAndCheckSuccessfulOrderWindowInChrome() {

        MainPageStellarBurgers objMainPage = new MainPageStellarBurgers(driver);
        LoginPageStellarBurgers objLoginPage = new LoginPageStellarBurgers(driver);
        RegistrationPageStellarBurgers objRegistrationPage = new RegistrationPageStellarBurgers(driver);
        userName = "Test User";
        userEmail = "TestChelForUi@mail.ru";
        userPassword = "123456789";

        objMainPage.clickLkButtonInHeader();
        objLoginPage.clickRegistrationButtonInLoginPage();
        objRegistrationPage.setName(userName);
        objRegistrationPage.setEmail(userEmail);
        objRegistrationPage.setPassword(userPassword);
        objRegistrationPage.clickRegistrationButtonInRegistrationPage();

    }


}

/*Данные для авторизации:
Chel Ui
ChelForUi@mail.ru
123456789
* */