package org.test;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class UserActions {

    @Test
    public void moveToElement() throws InterruptedException {
        open("https://www.spicejet.com/");
        SelenideElement addOn = $(By.xpath("//div[text()='Add-ons']"));
        addOn.hover();
        // actions().moveToElement(addOn).build().perform();
        //Thread.sleep(3000);

        //SelenideElement visaServices = $(By.xpath("//a[@data-testid='test-id-Visa Services']"));
        SelenideElement visaServices = $(By.xpath("//div[text()='Visa Services']"));
        visaServices.click();

        Thread.sleep(5000);
    }

    @Test
    public void dragAndDrop() throws InterruptedException {
        open("https://demoqa.com/droppable");
        SelenideElement sourceElement = $(By.id("draggable"));
        SelenideElement targetElement = $(By.id("droppable"));

        //actions().clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
        actions().dragAndDrop(sourceElement,targetElement).build().perform();

        Thread.sleep(3000);
    }

    @Test
    public void rightClick() throws InterruptedException {
        open("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        SelenideElement rightClick = $(By.className("context-menu-one"));

        rightClick.contextClick();

        Thread.sleep(3000);
    }
}
