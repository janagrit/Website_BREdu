package April_19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HandlinWindows {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Applications/1 selenium-java-3.141.59/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.duotech.io");

        System.out.println(driver.getTitle());

        driver.findElement(By.xpath("//a["));

        String windoeHandeParent = driver.getWindowHandle();
        System.out.println("The current " + windoeHandeParent);

        Set<String> windoeHandes = driver.getWindowHandles();
        System.out.println("All window handles: " + windoeHandes.getClass());

        for(String windowHandle: windoeHandes){
            if(windoeHandeParent.equals(windoeHandeParent)){
                driver.switchTo().window(windowHandle);
            }
        }
        System.out.println("The new page title is: " + driver.getTitle());
        System.out.println(driver.findElement(By.xpath("//h2[@class='about-side-header']")).getText());

        driver.switchTo().window(windoeHandeParent);
        System.out.println(driver.getTitle());

    }
}
