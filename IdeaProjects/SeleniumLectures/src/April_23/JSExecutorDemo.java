package April_23;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class JSExecutorDemo {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Applications/1 selenium-java-3.141.59/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/automation-practice-form");
        WebElement check = driver.findElement(By.id("hobbies-checkbox-1"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("argument[0].click()", check);

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        js.executeScript("document.getElementById('ct100_MainContent_username').value='Tester';");
        js.executeScript("document.getElementById('ct100_MainContent_password').value='tester';");

        js.executeScript("argument[0].click();",driver.findElement(By.id("ct100_MainContent_login_botton")));


        driver.get("https://www.duotech.io/");
        WebElement element = driver.findElement(By.xpath("//a[contains( text()), 'Software QA')]"));
        System.out.println(element.isDisplayed());
        js.executeScript("argument[0].click();", element);

    }
}
