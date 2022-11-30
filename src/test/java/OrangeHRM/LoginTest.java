package OrangeHRM;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class LoginTest {
    @Test
    public void testLogin(){
        open("https://opensource-demo.orangehrmlive.com/");
        LoginPage loginPage = new LoginPage();
        loginPage.resetPwdLink.shouldBe(visible);
        loginPage.orangeHRMLogo.shouldBe(visible);
        loginPage.login("Admin","admin123");
        //$(By.className("oxd-sidepanel")).shouldBe(visible);
        //sleep(10000);
        $(By.xpath("//div[@class='oxd-pie-chart']")).shouldBe(visible);
    }
}
