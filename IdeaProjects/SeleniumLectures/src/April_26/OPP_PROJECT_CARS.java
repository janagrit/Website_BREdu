package April_26;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class OPP_PROJECT_CARS {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Applications/1 selenium-java-3.141.59/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.carfax.com/");

        // 2. Click on Find a Used Car
        driver.findElement(By.xpath("//a[@class='button button--green']")).click();

      //3.  Verify the page title contains the word “Used Cars”
        String actualTitle = driver.getTitle();
        String expectedTitle = "Used Cars";
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }

        // 4. Choose “Tesla” for  Make.
        driver.findElement(By.name("make")).sendKeys("Tesla" + Keys.ENTER);

        // 5. Verify that the Select Model dropdown box contains 3 current Tesla models - (Model 3, Model S, Model X).


       // List<WebElement> models = driver.findElements(By.xpath("//*[@id=\"makeModelPanel\"]/form/div[2]/div/select/optgroup[1]"));


//        String model3 = driver.findElement(By.xpath("//option[@id='model_Model-3']")).getText();
//        String modelS = driver.findElement(By.xpath("//option[@id='model_Model-S']")).getText();
//        String modelX = driver.findElement(By.xpath("//option[@id='model_Model-X']")).getText();

        System.out.println(driver.findElement(By.xpath("//option[@id='model_Model-3']")).getText());
    //    System.out.println("Verify that the Select Model dropdown box contains 3 current Tesla models - (Model 3, Model S, Model X).");

//        if(models.contains(model3)){
//            System.out.println("Contains Model 3");
//        }else if (models.contains(modelS)){
//            System.out.println("Contains Model S");
//        }else if(models.contains(modelX)){
//            System.out.println("Contains Model X");
//        }

//
//        for (WebElement e: models) {
//            System.out.println(e.getTagName());
//        }

        // 6. Choose “Model S” for Model.


        // 7. Enter the zipcode as 22182 and click Next

        // 8.  Verify that the page has “Step 2 – Show me cars with” text

        //9. Click on all 4 checkboxes.

        // 10. Save the result of “Show me X Results” button to a variable. In this case it is 6.
       // 11.  Click on “Show me x Results” button.


    }
}
