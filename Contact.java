
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Contact {

    public Contact(){}
    public static void Run(WebDriver driver) {

        driver.get("https://www.graystillplays.store/contact");

        driver.findElement(By.cssSelector("input.theme-primary-color")).sendKeys("Jusuf Buljubasic");
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("jukson2000@gmail.com");
        driver.findElement(By.cssSelector("textarea")).sendKeys("Regression test!");
        WebElement button;
		try {
		    button = driver.findElement(By.xpath("//*[text()='Submit']")).click();
		} catch (NoSuchElementException e) {
		    button = null;
		}

		// Check if the button is present
		if (button != null) {
			System.out.println("Test is succesful, contact is working");
		} else {
			System.out.println("Test is not succesful, contact is not working");
		}
  }
}