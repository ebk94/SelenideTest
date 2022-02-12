package org.test;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class FindElements {
    @Test
    public void elementsTest(){
        open("http://www.amazon.com");
        ElementsCollection collection = $$(By.tagName("a"));
        System.out.println(collection.size());
//        for(SelenideElement element: collection){
//            String text = element.getText();
//            String href = element.getAttribute("href");
//            System.out.print(text + "-------" + href);
//        }

        collection.shouldHave(CollectionCondition.sizeLessThan(500));
        for (SelenideElement item : collection.last(10)) {
            System.out.println(item.getText());
        }
    }
}
