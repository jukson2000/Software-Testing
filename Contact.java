
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Contact {

    public Contact(){}
    public static void Run(WebDriver driver) {

        driver.get("https://www.graystillplays.store/contact");

        driver.findElement(By.cssSelector("input.theme-primary-color")).sendKeys("Jusuf Buljubasic");
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("jukson2000@gmail.com");
        driver.findElement(By.cssSelector("textarea")).sendKeys("Regression test!");
        driver.findElement(By.xpath("//*[text()='Submit']")).click();

        WebElement sPAN = driver.findElement(By.xpath("//*[text()='Email sent']"));

		String text = sPAN.getText();

		if (text.equals("Email sent")) {
			System.out.println("Ticket submited");
        }
        else {
          System.out.println("There's been an error in sending the ticket");
        }
  }
}