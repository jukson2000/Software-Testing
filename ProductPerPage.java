import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class ProductPerPage {
    
    public ProductPerPage(){}
    public static void Run(WebDriver driver) {
   
        driver.get("https://www.graystillplays.store/all-products");

        driver.findElement(By.xpath("//*[text()='Accept']")).click();

        WebElement itemsPerPageSelect = driver.findElement(By.id("plp-items-per-page"));

        List<WebElement> productListLis = driver.findElements(By.className("ais-Hits-item"));
        if (productListLis.size() < 21) {
            System.out.println("There are less than 21 li elements in the ul element.");
        } else {
            System.out.println("There are more than 20 li elements in the ul element.");
        }
        
        itemsPerPageSelect.click();
        WebElement itemsPerPage60Option = driver.findElement(By.cssSelector("option[value='60']"));
        itemsPerPage60Option.click();

        productListLis = driver.findElements(By.className("ais-Hits-item"));
        if (productListLis.size() < 61) {
            System.out.println("There are less than 61 li elements in the ul element.");
        } else {
            System.out.println("There are more than 60 li elements in the ul element.");
        }

        itemsPerPageSelect.click();
        WebElement itemsPerPage100Option = driver.findElement(By.cssSelector("option[value='100']"));
        itemsPerPage100Option.click();

        productListLis = driver.findElements(By.className("ais-Hits-item"));
        if (productListLis.size() < 101) {
            System.out.println("There are less than 101 li elements in the ul element.");
        } else {
            System.out.println("There are more than 100 li elements in the ul element.");
        }
        
    }
}