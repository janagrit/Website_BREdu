package April_12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Axis {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Applications/1 selenium-java-3.141.59/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.duotech.io/software-qa-engineer");

        System.out.println(driver.findElement(By.xpath("//div[@data-w-id='1a9a10ab-9099-0692-389c-e8ef87d67598']//h6")));

    }
}
