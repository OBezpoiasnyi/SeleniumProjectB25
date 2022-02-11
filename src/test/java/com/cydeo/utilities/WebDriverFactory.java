package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverFactory {


        public static WebDriver getDriver(String browserType){

            if(browserType.equalsIgnoreCase("chrome")){
                WebDriverManager.chromedriver().setup();
                WebDriver driver = new ChromeDriver();
                //driver.manage().window().maximize();
                return driver;
            }else if(browserType.equalsIgnoreCase("firefox")){
                WebDriverManager.firefoxdriver().setup();
                WebDriver driver = new FirefoxDriver();
                //driver.manage().window().maximize();
                return driver;
            }else if(browserType.equalsIgnoreCase("safari")){
                WebDriverManager.safaridriver().setup();
                WebDriver driver = new SafariDriver();
               // driver.manage().window().maximize();
                return driver;
            }
            return null;
        }


        // TASK: NEW METHOD CREATION
        // Method name : getDriver
        // Static method
        // Accepts String arg: browserType
        //   - This arg will determine what type of browser is opened
        //   - if "chrome" passed --> it will open chrome browser
        //   - if "firefox" passed --> it will open firefox browser
        // RETURN TYPE: "WebDriver"



}
