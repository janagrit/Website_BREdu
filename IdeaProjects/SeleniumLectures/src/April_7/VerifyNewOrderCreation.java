package April_7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyNewOrderCreation {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Applications/1 selenium-java-3.141.59/chromedriver");
        WebDriver driver = new ChromeDriver();
        //  WebDriver driver2 = new FirefoxDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

      //  3. Login using username Tester and password test




      //  4. Click on Order link
      //  5. Enter a random quantity between 1 and 100
    }
}
