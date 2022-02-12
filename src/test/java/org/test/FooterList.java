package org.test;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.List;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Selenide.*;

public class FooterList {
    @Test
    public void footerTest(){
        open("https://www.freshworks.com/");
        ElementsCollection collection = $$(By.xpath("//footer//ul/li/a"));
        System.out.println(collection.size());
        // To print out the all footer links
//        for (SelenideElement element : collection) {
//            System.out.println(element.getText());
//        }
        // To print out the last 10 links
//        for (SelenideElement element : collection.last(10)) {
//            System.out.println(element.getText());
//        }
         List<String> footerTextList = collection.texts();
        footerTextList.forEach(element ->System.out.println(element));
    }
}
