package activities;

import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

import static org.testng.AssertJUnit.assertEquals;

public class Activity2 {
    WebDriver driver;
    @BeforeTest
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get(" https://www.training-support.net/selenium/target-practice");
    }

    @Test
    public void FirstTestCase() {
        Assert.assertEquals("Target Practice",driver.getTitle());
    }

    @Test
    public void SecondTestCase() {
        WebElement BlackButton = driver.findElement(By.cssSelector(".ui.black.button"));
        //String Button = Blackbutton.getText();
        //System.out.println("Button");
        //To pass test case
        //Assert.assertEquals("Target Practice",Blackbutton.getText());

        //To fail test case
        Assert.assertEquals("Black",BlackButton.getText());
    }

    @Test(enabled = false)
    public void SkipTestCase() {
        Assert.assertEquals("Target Practice",driver.getTitle());
    }

    @Test
    public void SkipByExceptionTestCase() {

        //String Condition = Assert.assertEquals("Target Practice",driver.getTitle());
        //If (Condition = "True");
        throw new SkipException("skipping it");
    }

    @AfterClass
    public void AfterMethod() {
        driver.close();
    }

}


