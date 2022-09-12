import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        WebElement firstNameLocator = driver.findElement(By.id("firstName"));
        WebElement LastNameLocator = driver.findElement(By.id("lastName"));

        firstNameLocator.sendKeys("Swati");
        LastNameLocator.sendKeys("Sinha");

        WebElement emailLocator = driver.findElement(By.id("email"));
        emailLocator.sendKeys("swtsinha0@gmail.com");

        //WebElement contactNoLocator = driver.findElement(By.id("number"));
        //contactNoLocator.sendKeys("9590672084");
        driver.findElement(By.id("number")).sendKeys("1234567890");

        WebElement element = driver.findElement(By.className("field"));
        element.submit();

        driver.quit();

    }
}
