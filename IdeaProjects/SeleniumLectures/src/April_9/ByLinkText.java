package April_9;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLinkText {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Applications/1 selenium-java-3.141.59/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.duotech.io");
        // Click on Contacts link
        driver.findElement(By.linkText("Contacts")).click();





        // Verify the page title contains Contact Us
        System.out.println( driver.getTitle().contains("Contact Us") ? "1. Pass" : "1. Fails" );

        // go to amazon
        // locate the link with partial match "gift ideas"
        // click

        driver.get("https://www.amazon.com");

        try{
        driver.findElement(By.partialLinkText("gift ideas")).click();
        System.out.println( driver.getTitle().contains("Mother's Day") ? "2. Pass" : "2. Fails" );
        }catch (NoSuchElementException e){
            System.out.println("2. \"Mother's Day\" - this element was not find");
        }

        //driver.get("https://www.duotech.io");
        driver.navigate().to("https://www.duotech.io");

        System.out.println(driver.findElement(By.tagName("h1")).getText());

        //WebElement h1Element = driver.findElements("");

        driver.quit();

    }
}
