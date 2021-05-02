package April_21;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Warm_up {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Applications/1 selenium-java-3.141.59/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");

       // System.out.println(driver.getTitle());

        driver.findElement(By.id("firstName")).sendKeys("Fatih");
        driver.findElement(By.id("lastName")).sendKeys("Fatih");
        driver.findElement(By.id("userEmail")).sendKeys("Fatih@hot.mail");
        driver.findElement(By.xpath("//input[@id='gender-radio-1']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("userNumber")).sendKeys("2028674582");

        for (int i = 0; i < 10; i++) {
        driver.findElement(By.id("dateOfBirthInput")).sendKeys(Keys.BACK_SPACE);
        }

        driver.findElement(By.id("dateOfBirthInput")).sendKeys("7 Apr 2020" +Keys.ENTER);
        driver.findElement(By.id("subjectsInput")).sendKeys("fatih assigment");
        driver.findElement(By.id("hobbies-checkbox-1")).sendKeys(Keys.SPACE);
        driver.findElement(By.id("currentAddress")).sendKeys("2003 Patterson Street, MD" );

        driver.findElement(By.xpath("//div[.='NCR']")).click();
        driver.findElement(By.xpath("//div[.='NCR']")).click();





    }
}
