package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginPageStellarBurgers {

    private WebDriver driver;

    //Локатор до поля "Email" на странице авторизации
    private By emailInLoginPage = By.xpath(".//fieldset[1]/div/div/input");
    //Локатор до поля "Пароль" на странице авторизации
    private By passwordInLoginPage = By.xpath(".//input[@name='Пароль']");
    //Локатор до кнопки "Войти" на странице авторизации
    private By enterButtonInLoginPage = By.xpath(".//button[text()='Войти']");
    //Локатор до кнопки "Зарегистрироваться" на страницы авторизации
    private By registrationButtonInLoginPage = By.xpath(".//p/a[text()='Зарегистрироваться']");
    //Локатор до текста "Забыли войти?" на странице логина
    private By textForgetPassword = By.xpath(".//p[text()='Забыли пароль?']");
    //Локатор до кнопки "Восстановить пароль" на странице логина
    private By buttonPasswordRecover = By.xpath(".//p[text()='Забыли пароль?']/a");

    public LoginPageStellarBurgers(WebDriver driver) {
        this.driver = driver;
    }

    // Метод для нажатия на кнопку "Зарегистрироваться" на странице авторизации
    public void clickRegistrationButtonInLoginPage() {
        driver.findElement(registrationButtonInLoginPage).click();
    }
    // Метод для ввода текста в поле "Email" на странице логина
    public void setEmail(String userEmail) {
        driver.findElement(emailInLoginPage).sendKeys(userEmail);
    }
    // Метод для ввода текста в поле "Пароль"
    public void setPassword(String userPassword) {
        driver.findElement(passwordInLoginPage).sendKeys(userPassword);
    }
    // Метод для нажатия на кнопку "Войти" на странице авторизации
    public void clickLoginButtonInLoginPage() {
        driver.findElement(enterButtonInLoginPage).click();
    }
    // Метод получения текста "Войти" после перехода на страницу авторизации
    public String getEnterText() {
        return driver.findElement(enterButtonInLoginPage).getText();
    }

    public String getForgetPassword() {
        new WebDriverWait(driver, 3);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        return driver.findElement(textForgetPassword).getText();
    }

    public void setNameOnAuthorization(String userName) {
        driver.findElement(emailInLoginPage).sendKeys(userName);
    }
    public void setPasswordOnAuthorization(String userPassword) {
        driver.findElement(passwordInLoginPage).sendKeys(userPassword);
    }
    public void clickAuthorizationButtonInAuthorizationPage() {
        driver.findElement(enterButtonInLoginPage).click();
    }

    public void clickButtonPasswordRecoverInAuthorizationPage() {
        new WebDriverWait(driver, 3);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(buttonPasswordRecover).click();
    }

}
