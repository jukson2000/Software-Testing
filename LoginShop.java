import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginShop {

  public LoginShop (){}

  private static Timeout timeout;

    public static void Run(WebDriver driver){
 
        driver.get("https://www.graystillplays.store");       
            
        driver.findElement(By.xpath("//*[text()='Accept']")).click();
        driver.findElement(By.xpath("//*[text()='GrayStillPlays Seasons Yeetings T-Shirt - Black']")).click();
        driver.findElement(By.cssSelector("[aria-label=Colour]")).click();
        driver.findElement(By.cssSelector("[aria-label=Size]")).click();
        driver.findElement(By.xpath("//button[@type='button' and @class='increment-btn theme-secondary-font']")).click();
        driver.findElement(By.xpath("//*[text()='Add to basket']")).click();

        timeout.setTimeout(() -> {
          driver.findElement(By.xpath("//*[text()='Go to checkout']")).click();
        }, 2000);
        
        timeout.setTimeout(() -> {
            driver.findElement(By.id("customer.email")).sendKeys("ismarpolovina@icloud.com");
            driver.findElement(By.id("customer.password")).sendKeys("Smoke1337!");
            driver.findElement(By.xpath("//*[text()='Log In']")).click();
        }, 2000);
        
        timeout.setTimeout(() -> {
          driver.findElement(By.xpath("//*[text()='Continue to delivery method']")).click();
                }, 3000);

        timeout.setTimeout(() -> {
          driver.findElement(By.xpath("//*[text()='Continue to payment']")).click();
        }, 2000);


      /*   timeout.setTimeout(() -> {
                  driver.manage().window().maximize();
                  driver.switchTo().frame("__privateStripeFrame4359");
                  }, 5000);

              
                
                timeout.setTimeout(() -> {
                  driver.findElement(By.className("is-empty")).click();
                  driver.findElement(By.className("is-empty")).sendKeys("0000");
                  
                }, 2000);

                iFrame should go here */


                timeout.setTimeout(() -> {
                  driver.findElement(By.xpath("//*[text()='Confirm order']")).click();
                }, 2000);
    }
}