package April_16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipyIFrames {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Applications/1 selenium-java-3.141.59/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/frames");

        driver.switchTo().frame("frame1");
        System.out.println("sampleHeading");

        driver.switchTo().defaultContent();
        driver.switchTo().frame("");
    }
}
