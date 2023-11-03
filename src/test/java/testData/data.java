package testData;

import org.testng.annotations.DataProvider;

public class data {
    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][] { //https://www.saucedemo.com/
                {"standard_user", "secret_sauce"},
                {"locked_out_user", "secret_sauce"},
                {"problem_user", "secret_sauce"},
                {"performance_glitch_user", "secret_sauce"},
                {"error_user", "secret_sauce"},
                {"visual_user", "secret_sauce"},
                // Add more data pairs as needed
        };
    }
}
