import org.example.MainPageStellarBurgers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class TestNavigateThroughSectionConstructor {
    private WebDriver driver;

    @Before
    public void preparatoryDataForTestAuthorization() {
        driver = new ChromeDriver();
        driver.get("https://stellarburgers.nomoreparties.site/");
    }

    @Test
    public void testCorrectNavigateInBunTubInChrome() {
        MainPageStellarBurgers objMainPage = new MainPageStellarBurgers(driver);
        objMainPage.clickTubToppingsInHeader();
        objMainPage.clickTubBunInHeader();

        String actualTextFromBunHeader = objMainPage.getTextBunHeader();
        String expectedTextFromBunHeader = "Булки";
        assertEquals("Должна появиться надпись 'Булки'", expectedTextFromBunHeader, actualTextFromBunHeader);
    }

    @Test
    public void testCorrectNavigateInSauceTubInChrome() {
        MainPageStellarBurgers objMainPage = new MainPageStellarBurgers(driver);
        objMainPage.clickTubSauceInHeader();

        String actualTextFromSauceHeader = objMainPage.getTextSauceHeader();
        String expectedTextFromSauceHeader = "Соусы";
        assertEquals("Должна появиться надпись 'Соусы'", expectedTextFromSauceHeader, actualTextFromSauceHeader);
    }

    @Test
    public void testCorrectNavigateInToppingsTubInChrome() {
        MainPageStellarBurgers objMainPage = new MainPageStellarBurgers(driver);
        objMainPage.clickTubToppingsInHeader();

        String actualTextFromToppingsHeader = objMainPage.getTextToppingsHeader();
        String expectedTextFromToppingsHeader = "Начинки";
        assertEquals("Должна появиться надпись 'Начинки'", expectedTextFromToppingsHeader, actualTextFromToppingsHeader);
    }

    @After
    public void teardown() {
        // Закрыть браузер
        driver.quit();
    }

}
