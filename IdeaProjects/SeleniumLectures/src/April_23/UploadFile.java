package April_23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UploadFile {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Applications/1 selenium-java-3.141.59/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://bbcode0.com/");

        driver.findElement(By.id("file")).sendKeys("/Users/ianagrytsenko/Desktop/first file/images/alex.JPG");
//        WebElement uploadBotton = driver.findElement(By.id("uploadPictures"));
//        uploadBotton.sendKeys("/Users/ianagrytsenko/Desktop/first file/images/alex.JPG");




    }
}
