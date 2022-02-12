package org.test;
import java.util.List;
import java.io.File;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class WebDriverRunnerTest {

    @Test
    public void myTest(){
        open("https://opensource-demo.orangehrmlive.com/");

        WebDriverRunner.clearBrowserCache();
        WebDriverRunner.url();
        List<File> fileList =WebDriverRunner.getBrowserDownloadsFolder().files();
        System.out.println(fileList.size());
    }
}
