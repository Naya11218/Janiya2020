package Day8_052122;

import ReusableLibraries.Reusable_Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetTitle {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        //set chrome options arguments
        ChromeOptions options = new ChromeOptions();
        //set the condition to incognito mode
        options.addArguments("incognito");
        //set the condition to maximize /fullscreen your driver
        options.addArguments("start-maximized");
        //setting your driver as headless(running on background
        //for mac use full screen
        // options.addArguments(""start-fullscreen)

        //define the webdriver I am going to use
        WebDriver driver = new ChromeDriver(options);  //till here is precondition

        driver.navigate().to("https://www.google.com");
        Thread.sleep(3000);

        //capture the title of the page and compare it with your expected title 'GOOGLE'
        String actualTitle = driver.getTitle();
        if(actualTitle.equals("Google")){
            System.out.println("My title matches");

        } else {
            System.out.println("Title doesn't match. Actual Title is " + actualTitle);
        }




    }

}
