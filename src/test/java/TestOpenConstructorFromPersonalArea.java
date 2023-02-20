import io.qameta.allure.junit4.DisplayName;
import org.example.LoginPage;
import org.example.MainPage;
import org.example.ProfilePage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;
public class TestOpenConstructorFromPersonalArea {
    private String userEmail;
    private String userPassword;
    private WebDriver driver;
    @Before
    public void preparatoryDataForTestAuthorization() {
        driver = new ChromeDriver();
        driver.get("https://stellarburgers.nomoreparties.site/");
    }
    @Test
    @DisplayName("Авторизация и переход в конструктор по кнопке 'Конструктор'")
    public void testCorrectAuthorizationAndOpenConstructorThroughButtonPageInChrome() {
        MainPage objMainPage = new MainPage(driver);
        LoginPage objLoginPage = new LoginPage(driver);
        ProfilePage objProfilePage = new ProfilePage(driver);
        userEmail = "TestChelForUi@mail.ru";
        userPassword = "123456789";
        objMainPage.clickLkButtonInMainPage();
        objLoginPage.setNameOnAuthorization(userEmail);
        objLoginPage.setPasswordOnAuthorization(userPassword);
        objLoginPage.clickAuthorizationButtonInAuthorizationPage();
        objMainPage.clickLkButtonInHeader();
        objProfilePage.clickConstructorButtonInProfilePage();
        String actualTextCreateBurgerFromConstructor = objMainPage.getTextCreateBurgerFromConstructor();
        String expectedEnterText = "Соберите бургер";
        assertEquals("Должна появиться надпись 'Соберите бургер'", expectedEnterText, actualTextCreateBurgerFromConstructor);
    }
    @Test
    @DisplayName("Авторизация и переход в конструктор по логотипу'Stellar Burgers'")
    public void testCorrectAuthorizationAndOpenConstructorThroughLogoPageInChrome() {
        MainPage objMainPage = new MainPage(driver);
        LoginPage objLoginPage = new LoginPage(driver);
        ProfilePage objProfilePage = new ProfilePage(driver);
        userEmail = "TestChelForUi@mail.ru";
        userPassword = "123456789";
        objMainPage.clickLkButtonInMainPage();
        objLoginPage.setNameOnAuthorization(userEmail);
        objLoginPage.setPasswordOnAuthorization(userPassword);
        objLoginPage.clickAuthorizationButtonInAuthorizationPage();
        objMainPage.clickLkButtonInHeader();
        objProfilePage.clickLogoStellarBurgersInProfilePage();
        String actualTextCreateBurgerFromConstructor = objMainPage.getTextCreateBurgerFromConstructor();
        String expectedEnterText = "Соберите бургер";
        assertEquals("Должна появиться надпись 'Соберите бургер'", expectedEnterText, actualTextCreateBurgerFromConstructor);
    }
    @After
    public void teardown() {
        // Закрыть браузер
        driver.quit();
    }
}
