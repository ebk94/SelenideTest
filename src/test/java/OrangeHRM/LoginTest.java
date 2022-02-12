package OrangeHRM;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class LoginTest {
    @Test
    public void testLogin(){
        open("https://opensource-demo.orangehrmlive.com/");
        LoginPage.login("Admin","admin123");
    }
}
