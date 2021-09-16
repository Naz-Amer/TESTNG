package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Order {

    WebDriver driver;

    By product = By.xpath("//option[contains(text(),'MyMoney')]");
    By quantity = By.id("ctl00_MainContent_fmwOrder_txtQuantity");
    By pricePerUnit = By.id("ctl00_MainContent_fmwOrder_txtUnitPrice");
    By discount = By.id("ctl00_MainContent_fmwOrder_txtDiscount");
    By total = By.id("ctl00_MainContent_fmwOrder_txtTotal");

    @FindBy(xpath = "//option[contains(text(),'MyMoney')]")
    public WebElement producti;

    /**
     * Address Information
     */

    By customerName = By.id("ctl00_MainContent_fmwOrder_txtName");
    By street = By.id("ctl00_MainContent_fmwOrder_TextBox2");
    By ciy = By.id("ctl00_MainContent_fmwOrder_TextBox3");
    By state = By.id("ctl00_MainContent_fmwOrder_TextBox4");
    By zip = By.id("ctl00_MainContent_fmwOrder_TextBox5");

    /**
     * Payment Information
     */

    By card = By.id("ctl00_MainContent_fmwOrder_cardList_0");
    By card1 = By.id("ctl00_MainContent_fmwOrder_cardList_1");
    By card2 = By.id("ctl00_MainContent_fmwOrder_cardList_2");
    By cardNo = By.id("ctl00_MainContent_fmwOrder_TextBox6");
    By expireDate = By.id("ctl00_MainContent_fmwOrder_TextBox1");
    By processButton = By.id("ctl00_MainContent_fmwOrder_InsertButton");
    By resetButton = By.id("//input[@value='Reset']");

    public Order(WebDriver driver) {
        this.driver = driver;
    }


    public void NewOrder() {
        driver.findElement(product).click();
        driver.findElement(quantity).sendKeys("1");
        driver.findElement(pricePerUnit).clear();
        driver.findElement(pricePerUnit).sendKeys("120");
        driver.findElement(discount).sendKeys("10");
        driver.findElement(total).sendKeys("");
        driver.findElement(customerName).sendKeys("Tester Test");
        driver.findElement(street).sendKeys("3314 Airport Hyw");
        driver.findElement(ciy).sendKeys("Oregon");
        driver.findElement(state).sendKeys("Ohio");
        driver.findElement(zip).sendKeys("12345");
        driver.findElement(card).click();
        driver.findElement(cardNo).sendKeys("1234432112344321");
        driver.findElement(expireDate).sendKeys("11/21");
        driver.findElement(processButton).click();

    }
}
