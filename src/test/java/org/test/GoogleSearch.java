package org.test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GoogleSearch {
    @Test
    public void userCanSearchOnGoogle(){
        open("http://www.google.com");
        $(By.name("q")).setValue("Automation with Selenide");
        $(By.name("btnK")).click();
        $(By.id("logo")).shouldHave(Condition.appear);
        int headerCount = $$(By.cssSelector(".LC20lb.MBeuO.DKV0Md")).size();
        System.out.println(headerCount);

        $$(By.cssSelector(".LC20lb.MBeuO.DKV0Md")).shouldHave(CollectionCondition.size(13));
    }
}
