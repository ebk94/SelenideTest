package org.test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class BasicAuthHandle {
    @Test
    public void basicAuthTest() throws InterruptedException {
//        open("https://the-internet.herokuapp.com/basic_auth",
//                "","admin","admin"); // Basic auth
        Configuration.browserSize = "1440x900";
        open("https://dashboard.x5.dev.fabrique.studio/",
                "","fabrique","fabrique"); // Basic auth
        Thread.sleep(3000);
        $(By.xpath("//input[@placeholder='Электронная почта']")).sendKeys("admin@admin.ad");
        $(By.xpath("//input[@placeholder='Пароль']")).sendKeys("admin");
        $(new ByText("Далее")).click();

        Thread.sleep(5000);

//
//        String text = $(By.cssSelector("div.example")).getText();
//        System.out.println(text);
//        Assert.assertTrue(text.contains("Congratulations"));
    }
}
