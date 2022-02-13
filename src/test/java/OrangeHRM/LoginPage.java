package OrangeHRM;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
    private static SelenideElement  username = $(By.id("txtUsername")),
                            password = $(By.id("txtPassword")),
                            loginBtn = $(By.id("btnLogin"));
    public static SelenideElement resetPwdLink = $(By.id("forgotPasswordLink")),
                                  orangeHRMLogo = $(By.id("divLogo"));

public static void login(String name, String pwd){
    username.setValue(name);
    password.sendKeys(pwd);
    loginBtn.click();
    }
    // We can directly verify in the constructor as follows below
//    public LoginPage (){
//        resetPwdLink.shouldBe(visible);
//        orangeHRMLogo.shouldBe(visible);
//        System.out.println("hello");
//    }
}
