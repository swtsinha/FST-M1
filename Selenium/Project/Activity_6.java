package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Activity_6 {
    WebDriver driver;

    @BeforeMethod
    public void beforemethod() {
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");

    }

    @Test
    public void testcase() {

        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");

        driver.findElement(By.id("btnLogin")).click();

        WebElement directory = driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[9]/a/b"));
        Actions build = new Actions(driver); // heare you state ActionBuider
        build.moveToElement(directory).build().perform(); // Here you perform hover mouse over the needed elemnt to triger the visibility of the hidden

        directory.isDisplayed();
        directory.isEnabled();

        directory.click();

        String heading = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[1]/h1")).getText();
        Assert.assertEquals("Search Directory" ,heading);

    }

    @AfterMethod
    public void afterMethod(){
        driver.quit();


    }
}
