package April_12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length;

public class Warm_Up {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Applications/1 selenium-java-3.141.59/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/newtours/register_sucess.php");

        driver.findElement(By.linkText("REGISTER")).click();

        String first = "Iana";
        String last = "Grytsenko";
        driver.findElement(By.name("firstName")).sendKeys(first );
        driver.findElement(By.name("lastName")).sendKeys(last );
        driver.findElement(By.name("phone")).sendKeys("2028674582") ;
        driver.findElement(By.name("userName")).sendKeys("iana@gmail.com");
        driver.findElement(By.name("address1")).sendKeys("Patterson 2121, 34567");
        driver.findElement(By.name("city")).sendKeys("Hayttsville");
        driver.findElement(By.name("state")).sendKeys("MD");
        driver.findElement(By.name("postalCode")).sendKeys("28765");
        driver.findElement(By.name("country")).sendKeys("United States");

        driver.findElement(By.name("email")).sendKeys("janagrit");
        driver.findElement(By.name("password")).sendKeys("123456kk77");
        driver.findElement(By.name("confirmPassword")).sendKeys("123456kk77");
        driver.findElement(By.name("submit")).click();

        if(driver.getTitle().equals("Register: Mercury Tours")){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");}

        String str = driver.findElement(By.xpath("//tr//b")).getText();
        String actualName = str.substring(str.indexOf(first), str.length()-1);
        String expectedName = first + " " + last;

        if(actualName.equals(expectedName)){
            System.out.println("names are passed");
        }else
            System.out.println("names are failed" + "Actual name is: " + actualName + "Expected name is: " + expectedName);


    }
}
