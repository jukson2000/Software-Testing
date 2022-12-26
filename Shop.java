import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Shop {

  public Shop (){}

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
          driver.findElement(By.xpath("//*[text()='Go to checkout']")).click();
        }, 2000);
        
        timeout.setTimeout(() -> {
          driver.findElement(By.id("customer.email")).sendKeys("WilliamGarrard@dayrep.com");
        }, 2000);
                      
        driver.findElement(By.id("customer.first_name")).sendKeys("William");
        driver.findElement(By.id("customer.last_name")).sendKeys("Garrard");
        driver.findElement(By.id("customer.mobile")).sendKeys("0603307480");

        driver.findElement(By.xpath("//*[text()='Continue to address']")).click();
        
        timeout.setTimeout(() -> {
          driver.findElement(By.className("ant-input")).sendKeys("United States of America");
        }, 5000);

        driver.findElement(By.id("shipping_address.customer.full_name")).sendKeys("William Garrard");
        driver.findElement(By.id("shipping_address.postal_code")).sendKeys("90248");
        driver.findElement(By.id("shipping_address.address1")).sendKeys("17224 S. Figueroa Street");
        driver.findElement(By.id("shipping_address.city")).sendKeys("Gardena");
        driver.findElement(By.className("ant-select-selection-item")).click();

        timeout.setTimeout(() -> {
          driver.findElement(By.xpath("//*[text()='AK - Alaska']")).click();
        }, 1000);

        driver.findElement(By.id("shipping_address.phone")).sendKeys("0603307480");
        driver.findElement(By.xpath("//*[text()='Continue to delivery method']")).click();

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