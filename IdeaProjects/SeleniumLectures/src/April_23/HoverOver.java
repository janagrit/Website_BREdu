package April_23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class HoverOver {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Applications/1 selenium-java-3.141.59/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.duotech.io/");
        WebElement element = driver.findElement(By.xpath("//span[contains( text()), 'Software QA')]"));


        System.out.println(element.isDisplayed());

        WebElement element1 = driver.findElement(By.xpath("//div[@id='w-dropdown-toggle-2']//div[.='Programs']"));


        new Actions(driver).moveToElement(element).build().perform();
        Thread.sleep(2000);
        element.click();

//        System.out.println(driver.findElement(By.xpath("//<span[contains( text()), 'Software QA')]")).isDisplayed();
//        driver.findElement(By.xpath("//<span[contains( text()), 'Software QA')]")).click();
//        driver
    }
}
