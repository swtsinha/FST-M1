import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_4_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");
        System.out.println("The title of the page is " + driver.getTitle());

        WebElement firstname = driver.findElement(By.xpath("//input[@id = 'firstName']"));
        firstname.sendKeys("Swati");
        driver.findElement(By.xpath("//input[@id = 'lastName']")).sendKeys("Sinha");
        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("abc@gmail.com");
        driver.findElement(By.xpath("//input[@id = 'number']")).sendKeys("1234567890");
        driver.findElement(By.xpath ("//textarea")).sendKeys("My Message");
        //Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@value = 'submit']")).click();

        driver.quit();




    }
}
