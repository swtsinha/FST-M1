import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_4_3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
        System.out.println("The title of the page is " + driver.getTitle());

        String thirdHeader = driver.findElement(By.xpath("//h3[@id = 'third-header']")).getText();
       // String fifth;
        System.out.println("The text of Third Header is " + thirdHeader);

        //String fifthHeaderColour = driver.findElement(By.xpath("//h5")).getCssValue("color");
        //System.out.println("Fith header's colour is: " + fifthHeaderColour);

        String fifthHeaderColour = driver.findElement(By.xpath("//h5[@class = 'ui green header']")).getCssValue("color");
        System.out.println("The color of fifth Header is " + fifthHeaderColour);

        String VioletButtonClassAttribute = driver.findElement(By.xpath("//button[contains(text(),'Violet')]")).getAttribute("class");
        System.out.println("Class attribute value is " + VioletButtonClassAttribute );

        String GreyButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
        System.out.println("The text of Grey Button is " + GreyButton);

        driver.quit();




    }
}
