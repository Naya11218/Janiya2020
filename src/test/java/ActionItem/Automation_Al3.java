package ActionItem;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class Automation_Al3 {

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

        //capture search number and print for following hobbies using arrayList and for loop
        ArrayList<String> hobbies = new ArrayList<>();
        hobbies.add("Travelling");
        hobbies.add("Swimming");
        hobbies.add("Dancing");
        hobbies.add("Blogging");
        hobbies.add("Writing");

        for (int i = 0; i < hobbies.size(); i++) {

            //go to bing home page
            driver.navigate().to("https://www.bing.com");
            Thread.sleep(3000);

            //maximaize the driver
            driver.manage().window().maximize(); //for mac use window().fullscreen();
            //locate element for search field and type keyword 'hobbies'
            driver.findElement(By.xpath( "//*[@name='q']")).sendKeys(hobbies.get(i));
            //submit on bing search button
            driver.findElement(By.xpath("//*[@name='search']")).submit();
            Thread.sleep(2500);

            //capture the bing search and print it
            String searchResult = driver.findElement(By.xpath("//*[@id='b_tween']")).getText();
            //System.out.println("Result is " + searchResult);
            //extract out the number and print the search number only
            String[] arrayResult = searchResult.split(" ");
            System.out.println("My search number for hobby  " + hobbies.get(i) + " is " + arrayResult[0]); }


    }

}
