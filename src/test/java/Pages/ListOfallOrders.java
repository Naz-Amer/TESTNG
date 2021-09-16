package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ListOfallOrders {

    WebDriver driver;

    By checkAllbutton = By.xpath("//a[normalize-space()='Check All']");
    By uncheckAllbutton = By.xpath("//a[normalize-space()='Uncheck All']");
    By deleteAll = By.xpath("//input[@id='ctl00_MainContent_btnDelete']");
    By newLink = By.xpath("//a[normalize-space()='this link']");

    public ListOfallOrders(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy (xpath = "//table[@id='ctl00_MainContent_orderGrid']//tr")
    public WebElement select;

    public void CheckAll() {
        driver.findElement(checkAllbutton).click();

    }

    public void UncheckAll() {
        driver.findElement(uncheckAllbutton).click();
    }

    public  void DeleteAll(){
        driver.findElement(deleteAll).click();
    }

    public void NewLink(){
        driver.findElement(newLink).click();
    }

}

