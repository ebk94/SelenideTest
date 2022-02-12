package org.test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class JSAlertPopUpHandle {
    @Test
    public void alertTest() throws InterruptedException {
        // Configuration.browser = "firefox";
        open("https://the-internet.herokuapp.com/javascript_alerts");
        $(By.xpath("//button[.='Click for JS Alert']")).click();

        Thread.sleep(5000);

        Alert alert = switchTo().alert();
        String alertText = alert.getText();
        System.out.println(alertText);

        Assert.assertEquals(alertText, "I am a JS Alert");
        alert.accept();

        //$(By.xpath("//button[.='Click for JS Prompt']")).click();
        $(new ByText("Click for JS Prompt")).click();
        Alert jsPromt = switchTo().alert();
        jsPromt.sendKeys("Dummy text for testing");
        Thread.sleep(3000);
        jsPromt.accept();

    }
}
