import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConPref {

    public ConPref(){}
    private static Timeout timeout;

    public static void Run(WebDriver driver) {

        Login.Run(driver);

        timeout.setTimeout(() -> {
                driver.findElement(By.xpath("//*[text()='Contact Preferences']")).click();
        }, 3000);

        timeout.setTimeout(() -> {
            driver.findElement(By.xpath("//*[text()='By Email']")).click();
            driver.findElement(By.xpath("//*[text()='By SMS']")).click();
            driver.findElement(By.xpath("//*[text()='By Post']")).click();
            driver.findElement(By.xpath("//*[text()='Check all']")).click();
        }, 3000); 

        
        WebElement sPAN = driver.findElement(By.xpath("//*[text()='Update Contact Preferences']"));

		String text = sPAN.getText();

		if (text.equals("Update Contact Preferences")) {
			System.out.println("Preferences successfully updated");
        }
        else {
            System.out.println("There has been an error in changing preferences");
        }
  }
}