package April_16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WarmUp {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Applications/1 selenium-java-3.141.59/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

        String term = "keyboard";
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(term);
        driver.findElement(By.id("twotabsearchtextbox"));

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);

       // List<WebElement> links = driver.findElements(By.xpath("//a[@class='a-link-normal a-text-normal']"));
        List<WebElement> links = driver.findElements(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']"));

//        for (WebElement link : links) {
//
//            if(!link.getText().isEmpty()){
//                System.out.println();
//          //  System.out.println(link.getText());
//            System.out.println("  Contains mouse:  " + link.getText().toLowerCase().contains("mouse"));}
//        }

        boolean searchTerm = true;
        for (WebElement link : links) {
            if(!link.getText().isEmpty()){
                if(!link.getText().toLowerCase().contains(term)) {
                    searchTerm = false;
                } }
            }

        if(searchTerm){
            System.out.println("Pass " + term);
        }else{
            System.out.println("Fail");
        }
    }
        }
