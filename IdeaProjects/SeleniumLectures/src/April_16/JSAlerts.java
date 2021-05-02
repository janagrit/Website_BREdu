package April_16;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAlerts {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Applications/1 selenium-java-3.141.59/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[contains(text(), 'Alert' )]")).click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        if(driver.findElement(By.id("result")).getText().equals("You successfully clicked an alert")){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

        driver.findElement(By.xpath("//button[contains(text(), 'Confirm' )]")).click();

        alert.dismiss();
        if(driver.findElement(By.id("result")).getText().equals("You clicked: Cancel")){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

        driver.findElement(By.xpath("//button[contains(text(), 'Prompt' )]")).click();
        alert = driver.switchTo().alert();


        alert.sendKeys("Hola");
        System.out.println("ale" + alert.getText());
    }
}
