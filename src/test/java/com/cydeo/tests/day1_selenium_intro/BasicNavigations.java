package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        //1 - set up the browser driver
        WebDriverManager.chromedriver().setup();

        //2 - create instance of the Selenium WebDriver
        WebDriver driver = new ChromeDriver();

        //3 - go to the Tesla.com
        driver.get("https://www.tesla.com");

        //this line will maximize the browser size
        driver.manage().window().maximize();

        //get the title of the page
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        //getting the current URL using selenium
        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        // use selenium to navigate back
        driver.navigate().back();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate forward
        driver.navigate().forward();

        //use selenium to navigate refresh
        driver.navigate().refresh();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use navigate to method
        driver.navigate().to("https://www.google.com");
        currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        //getting the current URL using selenium
        currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        //this will close the currently open window
        driver.quit();

        //this will close all of the  opened window
        driver.close();



    }
}
