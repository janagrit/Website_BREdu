package April_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Applications/1 selenium-java-3.141.59/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.duotech.io");

        String text = driver.findElement(By.xpath("//a[@class='link-4 w--current']")).getText();
        System.out.println(text);

        String text1 = driver.findElement(By.xpath("//a[@class='link-4']")).getText();
        System.out.println(text1);


    }
}
