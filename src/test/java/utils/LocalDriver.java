package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.sql.DriverManager;

public class LocalDriver {


    public WebDriver LocalDriver(){
        WebDriverManager.chromedriver().setup();
       return new ChromeDriver();
    }

}
