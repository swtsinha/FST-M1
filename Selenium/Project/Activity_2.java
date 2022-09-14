package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Activity_2 {
    WebDriver driver;

    @BeforeMethod
    public void beforemethod() {
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");

    }

    @Test
    public void testcase() {
        WebElement headerImage = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/img"));
        String headerURL = headerImage.getAttribute("src");
        System.out.println("Header Image URL is " + headerURL);
        }

    @AfterMethod
    public void afterMethod(){
        driver.quit();


    }
}
