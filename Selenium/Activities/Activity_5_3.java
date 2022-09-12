import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_5_3 {
    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();
        driver.get(" https://training-support.net/selenium/dynamic-controls");
        System.out.println("The title of the page is " + driver.getTitle());

        WebElement TextField = driver.findElement(By.id("input-text"));
        System.out.println(("The text field is enabled :" + TextField.isEnabled()));

        driver.findElement(By.id("toggleInput")).click();

        System.out.println(("The text field is enabled :" + TextField.isEnabled()));

        driver.quit();




    }
}
