import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\paramsa1\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.click();
        firstName.sendKeys("Sangesh");

        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.click();
        lastName.sendKeys("Parameswaran");

        WebElement jobTitle = driver.findElement(By.id("job-title"));
        jobTitle.click();
        jobTitle.sendKeys("Senior Manager");

        WebElement educationRadio = driver.findElement(By.id("radio-button-2"));
        educationRadio.click();

        WebElement sexCheck = driver.findElement(By.id("checkbox-1"));
        sexCheck.click();

        WebElement yearsSelect = driver.findElement(By.id("select-menu"));
        yearsSelect.click();

        driver.findElement(By.cssSelector("option[value='4']")).click();

        driver.findElement(By.id("datepicker")).sendKeys("06/16/2024");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();



        driver.quit();
    }
}
