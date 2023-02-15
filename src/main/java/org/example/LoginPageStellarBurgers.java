package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageStellarBurgers {

    private WebDriver driver;

    //Локатор до поля "Email" на странице регистрации
    private By emailInLoginPage = By.xpath(".//label[text()='Email']");
    //Локатор до поля "Пароль" на странице регистрации
    private By passwordInLoginPage = By.xpath(".//label[text()='Пароль']");
    //Локатор до кнопки "Войти" на странице авторизации
    private By enterButtonInLoginPage = By.xpath(".//form[@class='Auth_form__3qKeq mb-20']/button[text()='Войти']");
    //Локатор до кнопки "Зарегистрироваться" на страницы авторизации
    private By registrationButtonInLoginPage = By.xpath(".//p[text()='Вы — новый пользователь?']/a[text()='Зарегистрироваться']");
    public LoginPageStellarBurgers(WebDriver driver) {
        this.driver = driver;
    }

    // Метод для нажатия на кнопку "Зарегистрироваться" на странице авторизации
    public void clickRegistrationButtonInLoginPage() {
        driver.findElement(registrationButtonInLoginPage).click();
    }


}
