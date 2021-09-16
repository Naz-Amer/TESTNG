package TestCases;

import Base.BaseDriver;
import Pages.ListOfallOrders;
import Pages.Login;
import Pages.Order;
import Pages.ViewAllOrders;
import Utility.CustomDataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class CheckAll extends BaseDriver {

    @Test (dataProvider = "Login",dataProviderClass = CustomDataProvider.class)
    void Log(String username,String password) {
        Login login = new Login(driver);
        login.logintoApplication("Tester", "test");
        login.LoginButton();
    }

    @Test(dependsOnMethods = {"Log"})
    void checkandDelete() {
        ListOfallOrders check = new ListOfallOrders(driver);
        check.CheckAll();
        check.DeleteAll();
        check.NewLink();
    }

    @Test(dependsOnMethods = {"checkandDelete"})
    void NewCustomerOrder() {
        Order order = new Order(driver);
        order.NewOrder();
    }

    @Test(dependsOnMethods = {"NewCustomerOrder"})
    void viewallOrders() {

        ViewAllOrders all = new ViewAllOrders(driver);
        all.Allorders();


        List<WebElement> tableRows =
                driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr"));
        String columnFirst = "//table[@id='ctl00_MainContent_orderGrid']//tr[";
        String columnLast = "]//td";
        String column;
        List<WebElement> tableColumns;
        for (int i = 0; i <= tableRows.size(); i++) {
            column = columnFirst + i + columnLast;

            tableColumns = driver.findElements(By.xpath(column));

            for (int j = 0; j < tableColumns.size(); j++) {
                System.out.print(tableColumns.get(j).getText() + " ");
            }
            System.out.println();
        }

    }


}
