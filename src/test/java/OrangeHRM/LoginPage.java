package OrangeHRM;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
    private static SelenideElement  username = $(By.name("username")),
                            password = $(By.name("password")),
                            loginBtn = $(By.cssSelector(".oxd-form-actions.orangehrm-login-action"));
    public static SelenideElement resetPwdLink = $(By.className("orangehrm-login-forgot")),
                                  orangeHRMLogo = $(By.xpath("//img[@alt='company-branding']"));

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
