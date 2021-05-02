package April_12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebElementMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Applications/1 selenium-java-3.141.59/chromedriver");
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        System.out.println(driver.findElement(By.name("q")).getAttribute("class"));
        System.out.println(driver.findElement(By.name("q")).getAttribute("data-ved"));


        // getAttribute()
        driver.get("http://automationpractice.com/index.php?id_product=1&controller=product");
        int expectedQuantity = 1;
        String actualQuantity = driver.findElement(By.id("quantity_wanted")).getAttribute("value");

//        if(actualQuantity.equals(expectedQuantity)){
//            System.out.println("Pass");
//        }else {
//            System.out.println("Fail");
//        }

        if  (Integer.parseInt(actualQuantity) == expectedQuantity){
            System.out.println("Pass");
        }else {
           System.out.println("Fail");
       }

        //getText()
        driver.get("https://www.duotech.io/");
        System.out.println(driver.findElement(By.xpath("//p[@class='paragraph-big']")).getText());
        System.out.println(driver.findElement(By.xpath("//div[@class='hero-table-intro']")).getText());

        // Verify red color error msg //-> getCssValue()
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester" );
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("terst" );
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        System.out.println(driver.findElement(By.id("ctl00_MainContent_status")).getCssValue("display"));
        System.out.println(driver.findElement(By.id("ctl00_MainContent_status")).getCssValue("float"));
        System.out.println(driver.findElement(By.id("ctl00_MainContent_status")).getCssValue("clear"));


        String expectedColor = "rgba(255, 0, 0, 1)";
        String actualColor = driver.findElement(By.id("ctl00_MainContent_status")).getCssValue("color");

        if(expectedColor.equals(actualColor)){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }

        //-> getLocation()
        driver.get("https://www.duotech.io/");

       System.out.println(driver.findElement(By.xpath("//div[@class='logo-wrapper']")).getLocation());
        System.out.println(driver.findElement(By.xpath("//img[@class='image-2']")).getLocation());
        System.out.println(driver.findElement(By.xpath("//h1")).getLocation());


        //-> getSize()
        driver.get("https://www.duotech.io/");

        System.out.println(driver.findElement(By.xpath("//div[@class='logo-wrapper']")).getSize());
        System.out.println(driver.findElement(By.xpath("//img[@class='image-2']")).getSize());
        System.out.println(driver.findElement(By.xpath("//h1")).getSize());

        //-> getTagName()
        driver.get("https://www.duotech.io/");
        System.out.println(driver.findElement(By.xpath("//a[@class='link-4 w--current']")).getTagName());

        driver.get("https://www.google.com/");

     //   List<WebElement> elementrrr =  driver.findElement(By.xpath("a"));

        List<WebElement> elements = driver.findElements(By.xpath("//*[@class='gNO89b']"));
        List<WebElement> elements2 = driver.findElements(By.xpath("//*[@class='MV3Tnb']"));


        for(WebElement el: elements2){
            System.out.println(el.getTagName());
        }

        driver.findElement(By.name("q")).sendKeys("How much is average salary for QA in Ukraine");
        driver.findElement(By.name("q")).clear();

        driver.get("https://www.dice.com/");
        driver.findElement(By.id("google-location-search")).sendKeys("New York" + Keys.ENTER);

        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("aplles");
        driver.findElement(By.name("btnK")).submit();
    }
}
