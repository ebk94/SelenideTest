package org.test;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$$;

public class CrossBrowser {

    @Test
    public void crossBrowserTest(){
        Configuration.browser = "chrome"; // "firefox" , "safari", "ie"
        // Configuration.headless = true;
        Configuration.baseUrl = "https://www.google.com";
        Configuration.browserSize = "1440x900"; // resize browser window
        open("/");
        $(By.name("q")).setValue("Automation with Selenide").pressEnter();
        // $(By.name("btnK")).click();
        $(By.id("logo")).shouldHave(Condition.appear);
        int headerCount = $$(By.cssSelector(".LC20lb.MBeuO.DKV0Md")).size();
        System.out.println(headerCount);

        $$(By.cssSelector(".LC20lb.MBeuO.DKV0Md")).shouldHave(CollectionCondition.size(13));
    }
}
