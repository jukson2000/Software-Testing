import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContentDisplay {

    public ContentDisplay(){}
    private static Timeout timeout;

	public static void Run(WebDriver driver) {

		driver.get("https://www.graystillplays.store/all-products");

		driver.findElement(By.xpath("//*[text()='Accept']")).click();
        driver.findElement(By.xpath("//*[text()='GrayStillPlays Seasons Yeetings T-Shirt - Black']")).click();
		
        timeout.setTimeout(() -> {

            WebElement image = driver.findElement(By.xpath("//img[@src='https://cdn.ingenuitylite.com/graystillplays/images/637cc41415825f002699ab6a/gsp-tshirt.png']"));

            if (image.isDisplayed()) {
                System.out.println("Test is succesful, image is present");
            } else {
                System.out.println("Test is not succesful, image is not present");
            }
        }, 6000);

		WebElement h1 = driver.findElement(By.xpath("//h1"));

		String text = h1.getText();

		if (text.equals("GrayStillPlays Seasons Yeetings T-Shirt - Black")) {
			System.out.println("Test is succesful, text is present");
		} else {
			System.out.println("Test is not succesful, text is not present");
		}

		WebElement div = driver.findElement(By.cssSelector(".ant-row.options-columns"));

		if (div.isDisplayed()) {
			System.out.println("Test is succesful, selection menu is present");
		} else {
			System.out.println("Test is not succesful, selection menu is not present");
		}

		WebElement button;
		try {
		    button = driver.findElement(By.xpath("//button[contains(text(), 'Add to basket')]"));
		} catch (NoSuchElementException e) {
		    button = null;
		}

		// Check if the button is present
		if (button != null) {
			System.out.println("Test is succesful, add to cart is present");
		} else {
			System.out.println("Test is not succesful, add to cart is not present");
		}	
	}
}