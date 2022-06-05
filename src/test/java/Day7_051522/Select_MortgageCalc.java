package Day7_051522;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Select_MortgageCalc {
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

        driver.navigate().to("https://www.mortgagecalculator.org");
        Thread.sleep(3000);
        WebElement startMonth = driver.findElement(By.xpath("//*[@name='param[start_month]']"));
        //Select dropDown = new Select(startMonth);
       // dropDown.selectByVisibleText("Jun");
        startMonth.click();
        driver.findElement(By.xpath("//*[text()='Jun']")).click();
        WebElement loanType = driver.findElement(By.xpath("//*[@name='param[milserve]']"));
        Select loanTypeDropdown = new Select(loanType);
        loanTypeDropdown.selectByVisibleText("FHA");


    }
}
