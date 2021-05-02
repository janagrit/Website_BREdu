package April_16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Tables {

    public static void main(String[] args) {

        // http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx
        System.setProperty("webdriver.chrome.driver", "/Applications/1 selenium-java-3.141.59/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test" + Keys.ENTER );
        driver.findElement(By.cssSelector("a[href='Default.aspx']")).click();

        List<WebElement> elements = driver.findElements(By.xpath(" //table[@id='ctl00_MainContent_orderGrid']//tr[1]//th"));

        for (WebElement element : elements) {
            System.out.printf(element.getText());
        }

        List<WebElement> elements1 = driver.findElements(By.xpath(" //table[@id='ctl00_MainContent_orderGrid']//tr[1]//td"));
        for (WebElement webElement : elements1) {

            if(webElement.getText().equals("7, Flower Street")){
                System.out.println("Found");
                break;
            }



            List<WebElement> rows = driver.findElements(By.xpath(" //table[@id='ctl00_MainContent_orderGrid']//tr"));
            for (WebElement row : rows) {
                    System.out.println(row.getText());

                }
        }



    }
}
