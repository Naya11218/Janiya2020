package Day6_051422;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebElement_mortagagecalculator {
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
        Thread.sleep(1500);

        //click , clear and enter new value on home value field
        WebElement homeValue = driver.findElement(By.xpath("//*[@id='homeval']"));
        homeValue.click();
        homeValue.clear();
        homeValue.sendKeys("450000");

        //click on % radio button
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@value='percent']")).click();

        //click , clear and enter new data on down payment field
        WebElement downPayment = driver.findElement(By.id("downpayment"));
        Thread.sleep(1500);
        downPayment.click();
        downPayment.clear();
        downPayment.sendKeys("5");

    }
}
