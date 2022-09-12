import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_4_1{
 public static void main (String[] args){
     WebDriver driver= new FirefoxDriver();
     driver.get("https://www.training-support.net");
     String Title = driver.getTitle();
     System.out.println("The title of page is " + Title);

     driver.findElement(By.xpath("/html/body/div/div/div/a") ).click();

     //String NewTitle=driver.getTitle();
     System.out.println(("The title of page after clicking is " + driver.getTitle()));

     driver.quit();
 }
}
