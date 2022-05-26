package activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Activity_1 {
    WebDriver driver;

    @BeforeMethod
        public void beforemethod() {
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");

    }

    @Test
        public void testcase() {
        String title = driver.getTitle();
        Assert.assertEquals("OrangeHRM", title);
    }

    @AfterMethod
        public void afterMethod(){
            driver.quit();


    }
}
