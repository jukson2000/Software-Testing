import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registration {

    public Registration(){}

    public static void Run(WebDriver driver){
        driver.get("https://www.graystillplays.store");
        driver.findElement(By.className("login-button")).click();
        driver.findElement(By.id("rc-tabs-0-tab-2")).click();
        driver.findElement(By.id("customer.first_name")).sendKeys("William");
        driver.findElement(By.id("customer.last_name")).sendKeys("Garrard");
        driver.findElement(By.id("customer.reg_email")).sendKeys("WillamGarrard@dayrep.com");
        driver.findElement(By.id("customer.reg_password")).sendKeys("Smoke1337!");
        driver.findElement(By.id("customer.reg_password_verify")).sendKeys("Smoke1337!");
        driver.findElement(By.xpath("//button[@type='submit' and @class='account-button button full theme-primary-button border-radius']")).click();
        
        timeout.setTimeout(() -> {
        }, 3000);

        WebElement sPAN = driver.findElement(By.xpath("//*[text()='Thank you for registering.Please verify your email address, check your inbox for the last step.']"));

		String text = sPAN.getText();

		if (text.equals("Thank you for registering.Please verify your email address, check your inbox for the last step.")) {
			System.out.println("Registration successefull");
        }
        else {
            System.out.println("Error during registration");
        }
    }
}
