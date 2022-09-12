import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Activity_6_1 {
    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
        driver.get(" https://training-support.net/selenium/dynamic-controls");
        System.out.println("The title of the page is " + driver.getTitle());

        WebElement Checkbox = driver.findElement(By.name("toggled"));
        WebElement CheckBoxToggleButton = driver.findElement(By.id("toggleCheckbox"));

        CheckBoxToggleButton.click();

        wait.until(ExpectedConditions.invisibilityOf(Checkbox));

        CheckBoxToggleButton.click();

        wait.until(ExpectedConditions.visibilityOf(Checkbox));

        Checkbox.click();

        driver.quit();




    }
}
