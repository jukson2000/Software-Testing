import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogOut {

  public LogOut (){}

  private static Timeout timeout;

    public static void Run(WebDriver driver){
    driver.get("https://www.graystillplays.store");
    driver.findElement(By.className("login-button")).click();
    driver.findElement(By.id("customer.email")).sendKeys("ismarpolovina@icloud.com");
    driver.findElement(By.id("customer.password")).sendKeys("Smoke1337!");

            timeout.setTimeout(() -> {
                Login.Run(driver);
                driver.findElement(By.xpath("//button[@type='button' and @class='ant-btn ant-btn-link btn-logout theme-secondary-font theme-nav-link signout-btn underline-hover']")).click();
                    }, 6000);

                    
                    WebElement sPAN = driver.findElement(By.xpath("//*[text()='Existing Customer']"));

                    String text = sPAN.getText();
                
                    if (text.equals("Existing Customer")) {
                      System.out.println("Logout successefull");
                        }
                        else {
                            System.out.println("Error during logout");
                        }
        
}
    
}