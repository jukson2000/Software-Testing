import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FailRegistration {

    public FailRegistration(){}

    public static void Run(WebDriver driver){
        driver.get("https://www.graystillplays.store");
        driver.findElement(By.className("login-button")).click();
        driver.findElement(By.id("rc-tabs-0-tab-2")).click();
        driver.findElement(By.id("customer.first_name")).sendKeys("");
        driver.findElement(By.id("customer.last_name")).sendKeys("");
        driver.findElement(By.id("customer.reg_email")).sendKeys("WilliamRGarrard");
        driver.findElement(By.id("customer.reg_password")).sendKeys("xxxxxx");
        driver.findElement(By.id("customer.reg_password_verify")).sendKeys("Smoke1337!");
        driver.findElement(By.xpath("//button[@type='submit' and @class='account-button button full theme-primary-button border-radius']")).click();

        WebElement sPAN = driver.findElement(By.xpath("//*[text()='This field is required.']"));

		String text = sPAN.getText();

		if (text.equals("This field is required.")) {
			System.out.println("There has been an error in changing information");
        }
    }
}