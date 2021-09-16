package TestCases;

import Base.BaseDriver;
import Pages.Login;
import org.testng.annotations.Test;

public class LoginTest extends BaseDriver {



    @Test
    void testLogin(){
        Login login = new Login(driver);
        login.logintoApplication("Tester","test");
        login.LoginButton();
    }
}
