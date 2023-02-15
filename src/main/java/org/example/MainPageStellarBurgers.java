package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageStellarBurgers {

    private WebDriver driver;
    // Локатор до кнопки "Личный кабинет" в хедере
    private By lkButtonInHeader = By.xpath(".//p[text()='Личный Кабинет']");
    // Локатор до кнопки "Войти в аккаунт" на основной странице (Это так же кнопка "Оформить заказ" если пользователь зарегистрирован)
    private By authorizationOrOrderButtonOnMainPage = By.className("button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_large__G21Vg");
    // Локатор до кнопки "Конструктор"
    private By constructorButtonInHeader = By.xpath(".//p[text()='Конструктор']");
    //Локатор до кнопки логотипа сайта
    private By logoButton = By.className("AppHeader_header__logo__2D0X2");
    // Локатор до кнопки "Выход"
    private By exitLKButtonIn = By.className("Account_button__14Yp3 text text_type_main-medium text_color_inactive");
    // Локатор до вкладки "Булки"
    private By bunTub = By.xpath(".//p[text()='Булки']");
    // Локатор до вкладки "Соусы"
    private By sauceTub = By.xpath(".//p[text()='Соусы']");
    // Локатор до вкладки "Добавки"
    private By toppingsTub = By.xpath(".//p[text()='Начинки']");

    public MainPageStellarBurgers(WebDriver driver) {
        this.driver = driver;
    }

    // Метод для нажатия на кнопку "Личный кабинет" в хедере
    public void clickLkButtonInHeader() {
        driver.findElement(lkButtonInHeader).click();
    }



}
