package April_19;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class HandleWindowByTitle {
    static WebDriver driver;

    public static void main(String[] args) {

    }

    public static void switchByTitle(String title){
        Set<String> windowHandles = driver.getWindowHandles();

        for(String windowHandle : windowHandles){
            //driver.switchTo().window(windowHandles);
        }
    }
}
