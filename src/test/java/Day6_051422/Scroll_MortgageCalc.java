package Day6_051422;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scroll_MortgageCalc {
    public static void main(String[] args) throws InterruptedException {

        //setup your chromedriver with webdrivermanager
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


        //navigate to mortgagecalculator site
        driver.navigate().to("https://www.mortgagecalculator.org");
        Thread.sleep(3000);

        //declre javascriptexecutor variable
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        //scroll to pixel 400 on mortgage calc website
       jse.executeScript("scroll(0,800)");
        Thread.sleep (1500);
        //declare a webelement variable that we want to scroll into
        WebElement sharebutton = driver.findElement(By.xpath("//*[@aid = 'share_button']"));
        //scroll into share this calculation button
        //jse.executeScript( "argument[0].scrollIntoView(true);", sharebutton);
        //Thread.sleep(2000);
        // click on the share this calculation button
        //sharebutton.click();
        //Thread.sleep(2000);
        //scroll back up
        jse.executeScript("scroll(0,-400)");
        Thread.sleep(2000);
        //quit the chrome driver
        driver.quit();

    }

}
