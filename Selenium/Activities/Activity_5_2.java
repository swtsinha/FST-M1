import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_5_2 {
    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();
        driver.get(" https://training-support.net/selenium/dynamic-controls");
        System.out.println("The title of the page is " + driver.getTitle());

        WebElement Checkbox = driver.findElement(By.name("toggled"));
        System.out.println(("The checkbox is selected :" + Checkbox.isSelected()));

        driver.findElement(By.name("toggled")).click();

        System.out.println(("The checkbox is displayed :" + Checkbox.isSelected()));

        driver.quit();




    }
}
