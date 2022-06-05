package Day5_050822;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class ForLoop_ArrayList_GoogleSearch {

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


        //capture search number and print for following cities using arrayList and for loop
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Brooklyn");
        cities.add("Queens");
        cities.add("Bronx");
        cities.add("Manhattan");
        cities.add("Staten Island");

        for (int i = 0; i < cities.size(); i++) {



        //go to Google home page
        driver.navigate().to("https://www.google.com");
        Thread.sleep(3000);

        //maximaize the driver
        driver.manage().window().maximize(); //for mac use window().fullscreen();
        //locate element for search field and type keyword 'cars'
        driver.findElement(By.xpath( "//*[@name='q']")).sendKeys(cities.get(i));
        //submit on google search button
        driver.findElement(By.xpath("//*[@name='btnK']")).submit();
        Thread.sleep(2500);

        //capture the google search and print it
        String searchResult = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
        //System.out.println("Result is " + searchResult);
        //extract out the number and print the search number only
        String[] arrayResult = searchResult.split(" ");
        System.out.println("My search number for city  " + cities.get(i) + " is " + arrayResult[1]); }




    }

}
