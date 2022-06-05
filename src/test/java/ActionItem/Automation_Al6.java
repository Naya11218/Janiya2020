package ActionItem;

import ReusableLibraries.Reusable_Actions;
import ResuableClasses.Reusable_Actions_Logger;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Automation_Al6 {


    //declare the local driver outside so that it can be reusable with other annotation methods
    WebDriver driver;
    ExtentReports reports;
    ExtentTest logger;

    //before suite will set the driver you are using
    @BeforeSuite
    public void SetChromeDriver(){
        driver = Reusable_Actions.setDriver();
        //define the path to the report
        reports = new ExtentReports("src/main/java/HTML_Report/Automation.html",true);
    }//end of before suite annotation

    //test case 1: navigate to chick-fil-a and click on Order Now functionality
    @Test (priority = 1)
    public void SearchForKeyword(){
        logger = reports.startTest("Click on Order Food");
        driver.navigate().to("https://www.chick-fil-a.com");
        //click on Order Now
        Reusable_Actions_Logger.clickAction(driver,"//*[@class='order-now']", logger, "Order Food");
        //end the logger per test
        reports.endTest(logger);
    }//end of test 1

    @AfterSuite
    public void quitSession(){
        driver.quit();
        reports.flush();
    }//end of after suite



}
