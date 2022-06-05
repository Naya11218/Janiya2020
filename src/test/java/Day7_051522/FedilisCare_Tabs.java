package Day7_051522;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class FedilisCare_Tabs {
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

        driver.navigate().to("https://www.fideliscare.org");
        Thread.sleep(3000);

        driver.findElements(By.xpath("//*[text() = 'Shop For a Plan']")).get(0).click();
        Thread.sleep(1000);

        driver.findElements(By.xpath("//*[text() = 'Medicaid Managed Care']")).get(0).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@href = '/findadoctor']")).click();
        Thread.sleep(1000);

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.findElement(By.xpath("//*@class = 'fal fa-search-plus']")).click();
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(tabs.get(0));
        driver.findElement(By.xpath("//*[@class = 'fal fa-stethoscope fa-fw']")).click();
        Thread.sleep(3000);
    }
}
