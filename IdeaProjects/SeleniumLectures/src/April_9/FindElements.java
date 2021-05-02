package April_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Applications/1 selenium-java-3.141.59/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.duotech.io");

        System.out.println(driver.findElement(By.tagName("h1")));

        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println("The number of links on this page " + links.size());
        for (WebElement e: links) {
            System.out.println(e.getText());
        }
        for (WebElement e: links) {
            System.out.println(e.getAttribute("href"));
        }


        List<WebElement> listOfIframe = driver.findElements(By.tagName("iframe"));
        System.out.println(listOfIframe.size());

        driver.quit();

    }
}
