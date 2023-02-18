package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PasswordRecoverPageStellarBurgers {

    private WebDriver driver;

    //Локатор до кнопки "Войти" на странице восстановления пароля
    private By enterButtonInRecoverPage = By.xpath(".//p[text()='Вспомнили пароль?']/a[text()='Войти']");

    public PasswordRecoverPageStellarBurgers(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonEnterInFooterInPasswordRecoverPage() {
        driver.findElement(enterButtonInRecoverPage).click();
    }
}


//private By emailInLoginPage = By.xpath(".//label[text()='Email']");