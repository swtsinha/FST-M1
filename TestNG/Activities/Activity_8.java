package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;


public class Activity_8 {
    WebDriver driver;
    WebDriverWait wait;


    @BeforeMethod
    public void beforemethod() {
        //Open the OrangeHRM page
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("http://alchemy.hguy.co/orangehrm");

    }

    @Test
    public void testcase() {
        //login with credentials provided
        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");

        driver.findElement(By.id("btnLogin")).click();

        //Navigate to the Dashboard page and click on the Apply Leave option
        driver.navigate().to("http://alchemy.hguy.co:8080/orangehrm/symfony/web/index.php/dashboard");
        driver.findElement(By.xpath("//*[@id='dashboard-quick-launch-panel-menu_holder']/table/tbody/tr/td[4]/div/a/img")).click();

        //Select leave type and duration of the leave.
        // Create object of the Select class
        Select se = new Select(driver.findElement(By.xpath("//*[@id='applyleave_txtLeaveType']")));
        // Select the option by index
        se.selectByIndex(1);

        driver.findElement(By.id("applyleave_txtFromDate")).clear();
        driver.findElement(By.id("applyleave_txtFromDate")).sendKeys("2022-05-26", Keys.ENTER);

        driver.findElement(By.id("applyleave_txtToDate")).clear();
        driver.findElement(By.id("applyleave_txtToDate")).sendKeys("2022-05-26", Keys.ENTER);

        //Click Apply.
        driver.findElement(By.id("applyBtn")).click();

        //Navigate to the My Leave page to check the status of the leave application.
        driver.navigate().to("http://alchemy.hguy.co:8080/orangehrm/symfony/web/index.php/leave/viewMyLeaveList");

        driver.findElement(By.id("calFromDate")).clear();
        driver.findElement(By.id("calFromDate")).sendKeys("2022-05-26", Keys.ENTER);

        driver.findElement(By.id("calToDate")).clear();
        driver.findElement(By.id("calToDate")).sendKeys("2022-05-26", Keys.ENTER);

        driver.findElement(By.id("btnSearch")).click();

        WebElement table = driver.findElement(By.id("resultTable"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='resultTable']/tbody/tr[1]/td[1]")));
        WebElement tablevalue = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[1]/td[6]"));
        System.out.println("Status of applied leave is " + tablevalue.getText());
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}




