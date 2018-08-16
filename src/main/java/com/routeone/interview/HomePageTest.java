package com.routeone.interview;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;





public class HomePageTest {


    public static void main(String [] args){

        String baseUrl = "http://www.seleniumhq.org";
        System.setProperty("webdriver.gecko.driver", "/Users/seandunn92/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.google.com");

        WebElement searchField = driver.findElement(By.id("lst-ib"));


        searchField.sendKeys("pluralsight");

        WebElement searchButton = driver.findElement(By.cssSelector("[name=\"btnK\"]"));

        searchButton.click();

        driver.get("http://www.routeone.com");

        WebElement routeOneLogo = driver.findElement(By.cssSelector("[alt=\"logo\"]"));

      String actual = routeOneLogo.getAttribute("src");
      String expected = "/logo.png";



//        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/table/tbody/tr/td[2]/a/img")).click();



    }
}
