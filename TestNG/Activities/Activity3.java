package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity3 {
    WebDriver driver;
    @BeforeTest
      public void beforeMethod(){
      driver = new FirefoxDriver();
      driver.get("https://www.training-support.net/selenium/login-form");
    }
    @Test
    public void logintest() {
        WebElement user = driver.findElement(By.id("username"));
        WebElement pass = driver.findElement(By.id("password"));

        user.sendKeys("admin");
        pass.sendKeys("password");

        driver.findElement(By.xpath("//button[text()='Log in']")).click();


        //Read login message
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals("Welcome Back, admin", loginMessage);




    }
    @AfterTest
    public void AfterMethod() {
        driver.close();

        }
}
