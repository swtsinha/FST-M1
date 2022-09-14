package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;


public class Activity_9 {
    WebDriver driver;
    private int col_count, rows_count;

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

        // Navigate to the “My Info” page.
        driver.navigate().to("http://alchemy.hguy.co:8080/orangehrm/symfony/web/index.php/pim/viewMyDetails");

        // Locate the left hand menu.
        driver.findElement(By.id("sidenav"));

        //Click on the “Emergency Contacts” menu item
        driver.findElement(By.linkText("Emergency Contacts")).click();

        //Retrieve information about all the contacts listed in the table
        //Identify the table
        WebElement Table = driver.findElement(By.id("emgcontact_list"));
        List<WebElement> rows = Table.findElements(By.tagName("tr"));

        //row iteration
        for (int i = 0; i < rows.size(); i++) {
            //check column each in row, identification with 'td' tag
            List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));

            //column iteration
            for (int j = 0; j < cols.size(); j++) {
                //Print all the information to the console.
                System.out.println(cols.get(j).getText());
            }
        }
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}



