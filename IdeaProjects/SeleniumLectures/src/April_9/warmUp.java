package April_9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class warmUp {


    public static void main(String[] args) {

        // Setup

       // System.setProperty("webdriver.chrome.driver", "/Applications/1 selenium-java-3.141.59/chromedriver");
        //  WebDriver driver = new ChromeDriver();


        System.setProperty("webdriver.gecko.driver", "/Applications/1 selenium-java-3.141.59/geckodriver");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.duotech.io/");
        String str = "Duotech Academy";
        String source = driver.getPageSource();
        if(source.contains(str)){
            System.out.println("1. Verify the page title contains Duotech Academy = Passed");
        }else{
            System.out.println("1. Fail. The pade does not contain the word " + str);
        }

             //Navigate to tiktok.com
            //   4. Verify the url is https://www.tiktok.com/


        driver.get("https://www.tiktok.com/");
        String expectedUrl = "https://www.tiktok.com/";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.equals(expectedUrl)){
            System.out.println("2. Test case is passed. Actual URL "+ actualUrl + " matches to expected Url " + expectedUrl);
        }else{
            System.out.println("2. Test is failed. Actual URL is "+ actualUrl + " expected Url is " + expectedUrl);
        }

       // Navigate to https://stackoverflow.com/
       // 6. Verify the title contains Stack Overflow

        driver.get("https://stackoverflow.com/");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Stack Overflow";
        System.out.println();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("3. Test case is passed. The title "+ actualTitle + " contains " + expectedTitle);
        }else{
            System.out.println("3. Test is failed. Actual title is "+ actualTitle + " does not contain " + expectedTitle);
        }

        // 7. Navigate back to duotech.io and verify that page contains
      // Start New IT Career text

        driver.get("https://www.duotech.io/");
        String str1 = "Start New IT Career";
        String source1 = driver.getPageSource();

        if(source1.contains(str1)){
            System.out.println("4. Pass" );
        }else{
            System.out.println("4. Fail. The pade does not contain the word " + str);
        }

    }
    public static void assertEqual(String expected, String actual){
        if(expected.equals(actual)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail.");
        }
    }
    }
