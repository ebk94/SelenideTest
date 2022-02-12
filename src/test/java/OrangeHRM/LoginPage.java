package OrangeHRM;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
    private static SelenideElement username = $(By.id("txtUsername")),
                                  password = $(By.id("txtPassword")),
                                  loginBtn = $(By.id("btnLogin"));

public static void login(String name, String pwd){
    username.setValue(name);
    password.sendKeys(pwd);
    loginBtn.click();
    }

}
