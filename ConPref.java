import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConPref {

    public ConPref(){}
    private static Timeout timeout;

    public static void Run(WebDriver driver) {

        Login.Run(driver);

        timeout.setTimeout(() -> {
                driver.findElement(By.xpath("//*[text()='Contact Preferences']")).click();
        }, 3000);

        timeout.setTimeout(() -> {
            WebElement button;
		try {
		    button = driver.findElement(By.xpath("//*[text()='By Email']")).click();
		} catch (NoSuchElementException e) {
		    button = null;
		}   

        if (button != null) {
			System.out.println("Test is succesful, update is allowed");
		} else {
			System.out.println("Test is not succesful, update isnt allowed");
		}	

        try {
		    button = driver.findElement(By.xpath("//*[text()='By SMS']")).click();
		} catch (NoSuchElementException e) {
		    button = null;
		}   

        if (button != null) {
			System.out.println("Test is succesful, update is allowed");
		} else {
			System.out.println("Test is not succesful, update isnt allowed");
		}

        try {
		    button = driver.findElement(By.xpath("//*[text()='By Post']")).click();
		} catch (NoSuchElementException e) {
		    button = null;
		}   

        if (button != null) {
			System.out.println("Test is succesful, update is allowed");
		} else {
			System.out.println("Test is not succesful, update isnt allowed");
		}
            
        try {
		    button = driver.findElement(By.xpath("//*[text()='Check all']")).click();
		} catch (NoSuchElementException e) {
		    button = null;
		}   

        if (button != null) {
			System.out.println("Test is succesful, update is allowed");
		} else {
			System.out.println("Test is not succesful, update isnt allowed");
		}
            
        }, 6000); 

        

  }
}