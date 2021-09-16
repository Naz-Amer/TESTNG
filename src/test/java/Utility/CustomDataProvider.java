package Utility;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {

    @DataProvider(name = "Login")

    public Object [][] getData(){

        Object[][] data = {{"Tester","test"}};
        return data;
    }
}
