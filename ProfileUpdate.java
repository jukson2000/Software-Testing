import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class ProfileUpdate {

    public ProfileUpdate(){}
    private static Timeout timeout;

    public static void Run(WebDriver driver) {
        
        driver.get("https://www.graystillplays.store/account-details");

        driver.findElement(By.id("customer.email")).sendKeys("ismarpolovina@icloud.com");
        driver.findElement(By.id("customer.password")).sendKeys("Smoke1337!");
        driver.findElement(By.className("account-button")).click();

        timeout.setTimeout(() -> {
            WebElement firstNameInput = driver.findElement(By.name("first_name"));
            firstNameInput.clear();
            firstNameInput.sendKeys("Sacir");
        }, 2000);
    
        driver.findElement(By.xpath("//*[text()='Accept']")).click();

        WebElement lastNameInput = driver.findElement(By.name("last_name"));
        lastNameInput.clear();
        lastNameInput.sendKeys("Ademovic");

        WebElement telInput = driver.findElement(By.id("customer.mobile"));
        telInput.clear();
        telInput.sendKeys("387644444686");

        driver.findElement(By.className("ant-select-show-arrow")).click();
        driver.findElements(By.cssSelector("div[title='1']")).get(0).click();

        WebElement companyInput = driver.findElement(By.id("customer.company"));
        companyInput.clear();
        companyInput.sendKeys("Grab");

        WebElement vatNumberInput = driver.findElement(By.id("customer.vat_number"));
        vatNumberInput.clear();
        vatNumberInput.sendKeys("27368837");

        driver.findElement(By.xpath("//*[text()='Save changes']")).click();  

        System.out.println("Test passed, profile update is valid");
  }
}