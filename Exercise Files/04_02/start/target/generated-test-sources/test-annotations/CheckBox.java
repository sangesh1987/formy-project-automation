import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class CheckBox {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\paramsa1\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/checkbox");

        WebElement checkBox1 = driver.findElement(By.id("checkbox-1"));
        checkBox1.click();

        WebElement checkBox2 = driver.findElement(By.id("checkbox-2"));
        checkBox2.click();

        WebElement checkBox3 = driver.findElement(By.id("checkbox-3"));
        checkBox3.click();

        checkBox3.click();
        checkBox2.click();
        checkBox1.click();




    }
}
