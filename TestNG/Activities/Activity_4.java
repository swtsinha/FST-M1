package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;


public class Activity_4 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void beforemethod() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver , Duration.ofSeconds(20));
        driver.get("http://alchemy.hguy.co/orangehrm");

    }

    @Test
    public void testcase() {
        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");

        driver.findElement(By.id("btnLogin")).click();

        driver.findElement(By.xpath("//*[@id = 'menu_pim_viewPimModule']")).click();
        driver.findElement(By.xpath("//*[@id = 'menu_pim_viewPimModule']")).click();
        //driver.findElement(By.id("menu_pim_viewPimModule")).click();

        driver.findElement(By.id("btnAdd")).click();

        driver.findElement(By.id("firstName")).sendKeys("something");
        driver.findElement(By.id("lastName")).sendKeys("xyz");

        driver.findElement(By.id("btnSave")).click();

//Navigate back to the PIM page (Employee List tab) and verify the creation of your employee
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        driver.findElement(By.id("menu_pim_viewEmployeeList")).click();

        driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("something", Keys.RETURN);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("searchBtn")));
        driver.findElement(By.id("searchBtn")).click();

        WebElement table = driver.findElement(By.id("resultTable"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='resultTable']/tbody/tr[1]/td[3]")));
        WebElement tablevalue = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[1]/td[3]"));
        Assert.assertEquals("something" , tablevalue.getText());
    }

    @AfterMethod
    public void afterMethod(){
        driver.quit();


    }
}
