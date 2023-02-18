import org.example.LoginPageStellarBurgers;
import org.example.MainPageStellarBurgers;
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
    public void testCorrectAuthorizationAndOpenConstructorThroughButtonPageInChrome() {

        MainPageStellarBurgers objMainPage = new MainPageStellarBurgers(driver);
        LoginPageStellarBurgers objLoginPage = new LoginPageStellarBurgers(driver);
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
    public void testCorrectAuthorizationAndOpenConstructorThroughLogoPageInChrome() {

        MainPageStellarBurgers objMainPage = new MainPageStellarBurgers(driver);
        LoginPageStellarBurgers objLoginPage = new LoginPageStellarBurgers(driver);
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
