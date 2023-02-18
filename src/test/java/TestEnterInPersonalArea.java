import org.example.LoginPageStellarBurgers;
import org.example.MainPageStellarBurgers;
import org.example.ProfilePage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class TestEnterInPersonalArea {
    private String userEmail;
    private String userPassword;
    private WebDriver driver;

    @Before
    public void preparatoryDataForTestAuthorization() {
        driver = new ChromeDriver();
        driver.get("https://stellarburgers.nomoreparties.site/");
    }

    @Test
    public void testCorrectAuthorizationAndEnterInPersonalAreaPageInChrome() {

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

        String actualTextFromButtonProfile = objProfilePage.getTextFromButtonProfile();
        String expectedEnterText = "Профиль";

        assertEquals("Должна появиться надпись 'Профиль'", expectedEnterText, actualTextFromButtonProfile);
    }

    @After
    public void teardown() {
        // Закрыть браузер
        driver.quit();
    }
}
