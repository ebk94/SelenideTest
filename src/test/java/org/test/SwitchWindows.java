package org.test;

import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;

public class SwitchWindows {
    @Test
    public void handleWindow(){
        open("https://opensource-demo.orangehrmlive.com/");
        System.out.println(title());
        String title = title();
        $("img[alt='OrangeHRM on youtube']").click();

        switchTo().window(1);
        System.out.println(title());
        closeWindow();

        switchTo().window(0);
        System.out.println(title());

        closeWebDriver();
    }
}
