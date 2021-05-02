package April_23;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class WindowSize {


    public static void main(String[] args) throws IOException {


        System.setProperty("webdriver.chrome.driver", "/Applications/1 selenium-java-3.141.59/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.duotech.io/");

        System.out.println(driver.manage().window().getSize());
        driver.manage().window().setSize(new Dimension(1020, 1020));


    }
}
