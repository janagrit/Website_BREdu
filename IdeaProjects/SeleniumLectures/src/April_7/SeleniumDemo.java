package April_7;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

    public static void main(String[] args) {

        // Setup

        System.setProperty("webdriver.chrome.driver", "/Applications/1 selenium-java-3.141.59/chromedriver");
        WebDriver driver1 = new ChromeDriver();
      //  WebDriver driver2 = new FirefoxDriver();

        driver1.get("https://www.google.com/");

        String actualTitle = driver1.getTitle();
        String expectedTitle = "Google";
        System.out.println();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Test case is passed. Actual title "+ actualTitle + " matches to expected title " + expectedTitle);
        }else{
            System.out.println("Test is failed. Actual title is "+ actualTitle + " expected title is " + expectedTitle);
        }

        //driver1.quit();
       // driver1.close();

        // 4. verify page url is google.com
        String expectedUrl = "https://www.google.com/";
        String actualUrl = driver1.getCurrentUrl();

        if (actualUrl.equals(expectedUrl)){
            System.out.println("Test case is passed. Actual URL "+ actualUrl + " matches to expected Url " + expectedUrl);
        }else{
            System.out.println("Test is failed. Actual URL is "+ actualUrl + " expected Url is " + expectedUrl);
        }

//        System.out.println("Page sourse");
//        System.out.println("---------------");
//        String source = driver1.getPageSource();
//        System.out.println(source);




        // 5. Verify that word About is part of this page
        String str = "Selenium";
        String source = driver1.getPageSource();

        if(source.contains(str)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail. The pade does not contain the word " + str);
        }


        driver1.navigate().to("https://www.amazon.com");
        driver1.navigate().back();
        driver1.navigate().forward();
        driver1.navigate().refresh();
        driver1.quit();
    }
}

/*

        BASIC WEBDRIVER METHODS
        get() -Load a new web page in the current browser window.
        getCurentUrl() -Get a string representing the current URL that the browser is looking at.
        getTitle() -The title of the current page
        getPageSource() -Get the source of the last loaded page.
        quit() -Quits this driver, closing every associated window.
        close() -Close the current window, quitting the browser if it's the last window currently open.
        navigate().to()
        navigate().back()
        navigate().forward()

 */


/*
        WebElement inboxLink = driver.findElement(By.partialLinkText("Inbox"));
        System.out.println(inboxLink.getText());

        WebElement loginButton= driver.findElement(By.tagName("button"));
        loginButton.click();
        WebElement table = driver.findElement(By.id("summaryTable"));
        List<WebElement> rows  = table.findElements(By.tagName("tr"));

        List<WebElement> links = driver.findElements(By.tagName("a"));




 */