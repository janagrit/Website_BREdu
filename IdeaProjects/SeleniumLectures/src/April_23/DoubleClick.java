package April_23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DoubleClick {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Applications/1 selenium-java-3.141.59/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");

        driver.switchTo().frame("frame Examples");
        Actions action = new Actions(driver);
        WebElement aside = driver.findElement(By.tagName("aside"));
       // action.click(aside).click().build().perform();
        action.doubleClick(aside).build().perform();


    }




}
