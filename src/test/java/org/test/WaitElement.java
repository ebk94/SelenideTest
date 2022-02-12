package org.test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class WaitElement {
    @Test
    public void waitTest() throws InterruptedException {
        open("https://api.cogmento.com/register/");
        $(By.partialLinkText("Log in here")).click();
        SelenideElement email = $(By.name("email"));

        email.should(Condition.appear, Duration.ofSeconds(10)).sendKeys("admin");

        $(By.linkText("Sign Up")).click();
        SelenideElement checkBox = $(By.name("terms"));
        //checkBox.click();
        //checkBox.shouldBe(Condition.checked);
        checkBox.shouldNotBe(Condition.checked);
        Thread.sleep(2000);
    }
}
