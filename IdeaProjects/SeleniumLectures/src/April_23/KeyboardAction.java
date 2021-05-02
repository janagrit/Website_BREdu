package April_23;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class KeyboardAction {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Applications/1 selenium-java-3.141.59/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        Actions action = new Actions(driver);
//        driver.findElement(By.name("q")).sendKeys();
        WebElement inputbox = driver.findElement(By.name("q"));
        action.keyDown(Keys.LEFT_SHIFT).sendKeys(inputbox, "caps lock").keyUp(Keys.LEFT_SHIFT).build().perform();
        action.sendKeys(inputbox, "hellleo").build().perform();

        WebElement gmail = driver.findElement(By.linkText("Gmail"));
        action.keyDown(Keys.LEFT_CONTROL).click(gmail).keyUp(Keys.LEFT_CONTROL).build().perform();

    }
}
