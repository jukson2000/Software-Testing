import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test {

  public Test (){}

    public static void Run(WebDriver driver){
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println(size);
    }
    
}