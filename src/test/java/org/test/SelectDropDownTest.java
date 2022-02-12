package org.test;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class SelectDropDownTest {
    @Test
    public void userActions() throws InterruptedException {
        open("https://www.orangehrm.com/orangehrm-30-day-trial/");
        // Handling drop-down with html tag Select
        $(By.id("Form_submitForm_Country")).selectOption(2);
        Thread.sleep(2000);
        $(By.id("Form_submitForm_Country")).selectOption("Kazakhstan");
        Thread.sleep(2000);
        $(By.id("Form_submitForm_Country")).selectOptionByValue("Belgium");

        // Handling drop-down without html tag Select
        ElementsCollection countries = $$(By.cssSelector("select#Form_submitForm_Country option"));
        System.out.println(countries.size());
        for(SelenideElement country:countries){
            String countryName = country.getValue();
            // String countryName = country.getText();
            // System.out.println(countryName);
            if(countryName.equals("Kazakhstan")){
                //System.out.println(countryName);
                country.click();
                break;
            }
        }
        Thread.sleep(2000);
    }
}
