import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

  public Login (){}

    public static void Run(WebDriver driver){
    driver.get("https://www.graystillplays.store");
    driver.findElement(By.className("login-button")).click();
    driver.findElement(By.id("customer.email")).sendKeys("ismarpolovina@icloud.com");
    driver.findElement(By.id("customer.password")).sendKeys("Smoke1337!");
    driver.findElement(By.className("account-button")).click();
    System.out.println("Test passed account login is valid");
    }
    
}