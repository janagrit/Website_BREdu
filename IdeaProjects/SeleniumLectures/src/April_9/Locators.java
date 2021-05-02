package April_9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Applications/1 selenium-java-3.141.59/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

//        WebElement inputBox = driver.findElement(By.id("twotabsearchtextbox"));
//        inputBox.sendKeys("coctail dress" + Keys.ENTER);


        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("coctail dress" + Keys.ENTER);

        //Thread.sleep(5000);
        driver.get("https://www.google.com/?client=safari");
        driver.findElement(By.name("q")).sendKeys("high heel shoes" + Keys.ENTER);


        driver.get("https://www.duotech.io");
        String expected = "Start your new IT career";
        String actual = driver.findElement(By.className("black-text")).getText();

        if(expected.equals(actual)){
            System.out.println("1. Pass");
        }else{
            System.out.println("1. Failed. Actual text is: "+ actual);
        }

        System.out.println(driver.findElement(By.className("w--current")).getText());




        driver.quit();

    }
}
