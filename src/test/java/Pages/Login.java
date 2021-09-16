package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    WebDriver driver;

    By Username = By.id("ctl00_MainContent_username");

    By Password = By.id("ctl00_MainContent_password");

    By loginButton = By.id("ctl00_MainContent_login_button");


    public Login(WebDriver driver){
        this.driver = driver;
    }

    public void logintoApplication(String username,String password){
        driver.findElement(Username).sendKeys(username);
        driver.findElement(Password).sendKeys(password);

    }

    public void LoginButton(){
        driver.findElement(loginButton).click();
    }
}
