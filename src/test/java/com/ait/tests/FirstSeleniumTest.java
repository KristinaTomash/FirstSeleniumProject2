package com.ait.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
   WebDriver driver;
    //before- setUp-инициализируем браузер
    @BeforeMethod
    public void setUp(){
        driver=new ChromeDriver();
       // driver.get("https://www.google.com");

        //Альтернатива
        driver.navigate().to("https://www.google.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

    }
    //test -название говорит сам за скья на пример позитив регистрат тест
@Test
public void openGoogle(){
       System.out.println("Google opened");
}
    //after - tearDown -как правило закрывают брацзер
@AfterMethod(enabled = false)
    public void tearDown(){
        driver.quit();//закрывает все вкладки
    //    driver.close();//закрывает только одну вкладку
}

}
