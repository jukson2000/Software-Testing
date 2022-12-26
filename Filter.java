import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class Filter {

    public Filter(){}
    private static Timeout timeout;

    public static void Run(WebDriver driver) {

        driver.get("https://www.graystillplays.store/all-products");

        driver.findElement(By.xpath("//*[text()='Filters']")).click();

        timeout.setTimeout(() -> {
            driver.findElement(By.xpath("//*[text()='Accept']")).click();
        }, 3000);

        driver.findElement(By.cssSelector("input[value='10 and under']")).click();

        timeout.setTimeout(() -> {
            int random = driver.findElements(By.cssSelector("span.product-price")).size();
            if (random>0){
                List<WebElement> priceSpans = driver.findElements(By.cssSelector("span.product-price"));      

                boolean allPricesLessThan1001 = true;
                
                for (WebElement priceSpan : priceSpans) {
                    String priceText = priceSpan.getText();
                    System.out.println(priceSpan.getText());
                    priceText = priceText.replace("$", "");
                    double price = Double.parseDouble(priceText);
                    System.out.println(allPricesLessThan1001);
                    if (price >= 10.01) {
                        allPricesLessThan1001 = false;
                        break;
                    }
                }
                if (allPricesLessThan1001) {
                    System.out.println("There are items that are not 10$ or cheaper");
                } 
            }
            else {
                System.out.println("There are no items that are not 10$ or cheaper");
            }
        }, 3000);
        
        driver.findElement(By.cssSelector("input[value='10 - 30']")).click();

        timeout.setTimeout(() -> {
        }, 3000);

        List<WebElement> priceSpans = driver.findElements(By.cssSelector("span.product-price"));
        
        boolean allPricesBetween10and30 = true;
        for (WebElement priceSpan : priceSpans) {
            String priceText = priceSpan.getText();
            priceText = priceText.replace("$", "");
            double price = Double.parseDouble(priceText);
            if (price < 10 || price > 30) {
                allPricesBetween10and30 = false;
                break;
            }
        }
        if (allPricesBetween10and30) {
            System.out.println("There are no items that are not between 30$ and 50$");
        } else {
            System.out.println("There are items that are not between 30$ and 50$");
        }

        driver.findElement(By.cssSelector("input[value='30 - 50']")).click();

        timeout.setTimeout(() -> {   
                        }, 3000);

        priceSpans = driver.findElements(By.cssSelector("span.product-price"));
        
        boolean allPricesBetween30and50 = true;
        for (WebElement priceSpan : priceSpans) {
        String priceText = priceSpan.getText();
            priceText = priceText.replace("$", "");
            double price = Double.parseDouble(priceText);
            if (price < 30 || price > 50) {
                allPricesBetween30and50 = false;
                break;
            }
        }
        if (allPricesBetween30and50) {
            System.out.println("There are no items that are not between 30$ and 50$");
        } else {
            System.out.println("There are items that are not between 30$ and 50$");
        } 
    }
}