import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class FailProfileUpdate {

    public FailProfileUpdate(){}
    private static Timeout timeout;

    public static void Run(WebDriver driver) {
        
        driver.get("https://www.graystillplays.store/account-details");

        driver.findElement(By.id("customer.email")).sendKeys("ismarpolovina@icloud.com");
        driver.findElement(By.id("customer.password")).sendKeys("Smoke1337!");
        driver.findElement(By.className("account-button")).click();

        timeout.setTimeout(() -> {
            WebElement firstNameInput = driver.findElement(By.name("first_name"));
            firstNameInput.clear();
        }, 2000);
    
        driver.findElement(By.xpath("//*[text()='Accept']")).click();

        WebElement lastNameInput = driver.findElement(By.name("last_name"));
        lastNameInput.clear();

        WebElement telInput = driver.findElement(By.id("customer.mobile"));
        telInput.clear();

        driver.findElement(By.className("ant-select-show-arrow")).click();

        WebElement sPAN = driver.findElement(By.xpath("//*[text()='This field is required.']"));

		String text = sPAN.getText();

		if (text.equals("This field is required.")) {
			System.out.println("There has been an error in changing information");
        } else {
            System.out.println("Profile updated");
        }
       
  }
}