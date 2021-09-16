package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewAllOrders {

    By allorders = By.xpath("//a[normalize-space()='View all orders']");

    @FindBy(xpath = "//table[@id='ctl00_MainContent_orderGrid']//tr")
    public WebElement tr1;

    WebDriver driver;

    public ViewAllOrders(WebDriver driver){
        this.driver= driver;

    }

    public void Allorders(){
        driver.findElement(allorders).click();
    }
}
