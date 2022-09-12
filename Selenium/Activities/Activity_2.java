import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_2 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);

        WebElement element = driver.findElement(By.id("about-link"));
        System.out.println("The text in the WebElement is: " + element.getText());

        WebElement classNameLocator = driver.findElement(By.className("inverted"));
        System.out.println("The text in the WebElement is: " + classNameLocator.getText());

        WebElement linkTextLocator = driver.findElement(By.linkText("About Us"));
        System.out.println("The text in the WebElement is: " + linkTextLocator.getText());

        WebElement cssLocator = driver.findElement(By.cssSelector(".green"));
        System.out.println("The text in the WebElement is: " + cssLocator.getText());

        driver.quit();

    }
}
