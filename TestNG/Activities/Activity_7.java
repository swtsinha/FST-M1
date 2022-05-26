package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Activity_7 {
    WebDriver driver;

    @BeforeMethod
    public void beforemethod() {
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");

    }

    @Test
    public void testcase() {
        //Open the OrangeHRM page and login with credentials provided
        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");

        driver.findElement(By.id("btnLogin")).click();

        // Find the “My Info” menu item and click it.
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[6]/a/b")).click();

        // On the new page, find the Qualification option on the left side menu and click it
        driver.findElement(By.linkText("Qualifications")).click();

        //Add Work Experience and click Save.
        driver.findElement(By.id("addWorkExperience")).click();
        driver.findElement(By.id("experience_employer")).sendKeys("IBM");
        driver.findElement(By.id("experience_jobtitle")).sendKeys("Tester");
        driver.findElement(By.id("btnWorkExpSave")).click();

    }

    @AfterMethod
    public void afterMethod(){
        driver.quit();


    }
}
