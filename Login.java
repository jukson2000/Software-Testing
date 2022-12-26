import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

  public Login (){}

    public static void Run(WebDriver driver){
    driver.get("https://www.graystillplays.store");
    driver.findElement(By.className("login-button")).click();
    driver.findElement(By.id("customer.email")).sendKeys("ismarpolovina@icloud.com");
    driver.findElement(By.id("customer.password")).sendKeys("Smoke1337!");
    driver.findElement(By.className("account-button")).click();

    WebElement sPAN = driver.findElement(By.xpath("//*[text()='Update your information']"));

		String text = sPAN.getText();

		if (text.equals("Update your information")) {
			System.out.println("Login successefull");
        }
        else {
            System.out.println("Error during login");
        }
    }
    
}