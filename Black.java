import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Black {

    public Black(){}
    private static Timeout timeout;
    
    public static void Run(WebDriver driver) {
       
        driver.get("https://www.graystillplays.store/all-products");

        driver.findElement(By.xpath("//*[text()='Filters']")).click();

        timeout.setTimeout(() -> {
            driver.findElement(By.xpath("//*[text()='Accept']")).click();
        }, 6000);
        
        timeout.setTimeout(() -> {
            List<WebElement> we  = driver.findElements(By.cssSelector("input[type='checkbox']"));
            we.get(20).click(); 
        }, 2000);

        timeout.setTimeout(() -> {
            driver.findElement(By.cssSelector("[aria-label=Close]")).click();
        }, 4000);

        List<WebElement> spans = driver.findElements(By.cssSelector("span.ais-Highlight-nonHighlighted"));

        for (WebElement span : spans) {
        if (!span.getText().contains("Black")) {
            System.out.println("Error: Span does not contain the text 'Black'");
            break;
        }
        else {
            System.out.println("All products are of the selected color");
            break;
        }
        }
    }
}