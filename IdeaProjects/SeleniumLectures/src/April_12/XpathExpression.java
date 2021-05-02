package April_12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class XpathExpression {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Applications/1 selenium-java-3.141.59/chromedriver");
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();

        driver.get("https://www.duotech.io/");

        List<WebElement> el = driver.findElements(By.xpath("//*[@href]"));

        for (WebElement ell: el) {
            System.out.println(ell.getAttribute("href"));
        }
      //  driver.findElement(By.xpath("//a[@href='/enroll-sqae']")).click();
       driver.findElement(By.xpath("//a[@href='/enroll-sqae'] [@class='button-2 w-button']")).click();

        System.out.println(driver.findElement(By.xpath("//h1[.='Spring 2021']")).getText());
        System.out.println(driver.findElement(By.xpath("//h1[contains(text(), 'Enrollment')]")).getText());

        driver.get("https://www.duotech.io/faq");
        System.out.println(driver.findElement(By.xpath("(//a[@href='#'] //h5)[2]")).getText());

    }
}
