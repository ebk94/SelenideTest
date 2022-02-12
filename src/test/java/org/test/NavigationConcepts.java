package org.test;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class NavigationConcepts {
    @Test
    public void navigateTest() throws InterruptedException {
        open("https://www.google.com");
        System.out.println(title());

        open("http://www.amozon.com");
        System.out.println(title());

        back();
        System.out.println(title());

        forward();
        System.out.println(title());

        back();

        Thread.sleep(5000);

        refresh();
    }
}
