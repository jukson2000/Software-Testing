import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Quantity {

    public Quantity(){}
    private static Timeout timeout;

	public static void Run(WebDriver driver) {

		driver.get("https://www.graystillplays.store/all-products");

        driver.findElement(By.xpath("//*[text()='Accept']")).click();
        driver.findElement(By.xpath("//*[text()='GrayStillPlays Seasons Yeetings T-Shirt - Black']")).click();
        driver.findElement(By.xpath("//*[text()='Add to basket']")).click();

        timeout.setTimeout(() -> {

            WebElement div = driver.findElement(By.id("toggle-element"));
            String text = div.getText();

            if (text.equals("(1 items)")) {
                System.out.println("Test is succesful");
            } else {
                System.out.println("Test is not succesful");
            }

        }, 4000);
	}
}