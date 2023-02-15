package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPageStellarBurgers {

    private WebDriver driver;

    //Локатор до поля "Имя" на странице регистрации
    private By nameInLoginPage = By.xpath(".//label[text()='Имя']");
    //Локатор до поля "Email" на странице регистрации
    private By emailInLoginPage = By.xpath(".//label[text()='Email']");
    //Локатор до поля "Пароль" на странице регистрации
    private By passwordInLoginPage = By.xpath(".//label[text()='Пароль']");

    //Локатор до кнопки "Войти" на странице регистрации
    private By enterButtonInRegistrationPage = By.xpath(".//p[text()='Уже зарегистрированы?']/a[text()='Войти']");

    //Локатор до кнопки "Зарегистрироваться" на странице регистрации
    private By registrationButtonInRegistrationPage = By.xpath(".//button[text()='Зарегистрироваться']");

    public RegistrationPageStellarBurgers(WebDriver driver) {
        this.driver = driver;
    }

    // Метод для ввода текста в поле "Имя"
    public void setName(String userName) {
        driver.findElement(nameInLoginPage).sendKeys(userName);
    }
    // Метод для ввода текста в поле "Email"
    public void setEmail(String userEmail) {
        driver.findElement(emailInLoginPage).sendKeys(userEmail);
    }
    // Метод для ввода текста в поле "Пароль"
    public void setPassword(String userPassword) {
        driver.findElement(passwordInLoginPage).sendKeys(userPassword);
    }
    // Метод для нажатия на кнопку "Зарегистрироваться" на странице регистрации
    public void clickRegistrationButtonInRegistrationPage() {
        driver.findElement(registrationButtonInRegistrationPage).click();
    }



}

