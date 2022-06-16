package PageObjects;

import ResuableClasses.Reusable_Actions_POM_Loggers;
import ResuableClasses.Reusable_Annotation_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ChickfilaHomePage extends Reusable_Annotation_Class {

    //Declare the ExtentTest for each page object class
    ExtentTest logger;

    //create a constructor method that will reference the same name as your class, you can make your
    //page object class methods static when you call it in your test class
    public ChickfilaHomePage(WebDriver driver){
        //page factory function for page object
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotation_Class.logger;
    }//end of constructor


    //define all the webelements using @find by concept
    @FindBy(xpath = "//*[@class='btn-round btn-round--red']")
    WebElement clickonOrderNow;
    @FindBy(xpath = "//*[@class='sc-hAZoDl sc-hCDzWh eACeCK haBKel']")
    WebElement clickonPickUp;
   @FindBy(xpath = "//*[@name='location']")
    WebElement searchAddress;
    @FindBy(xpath = "//*[@type='submit']")
    WebElement clickonSubmit;
    @FindBy(xpath = "//*[@title='Select restaurant Flatbush and Atlantic In-Line']")
    WebElement selecttheAddress;


    public void ClickonOrderNow() {
        Reusable_Actions_POM_Loggers.clickAction(driver, clickonOrderNow, logger, "Order Now");
    }//end of ClickonOrderNow

    public void ClickonPickUp() {
        Reusable_Actions_POM_Loggers.clickAction(driver, clickonPickUp, logger, "Pick Up");
    }//end of setClickOnPickup

    public void setSearchforAddress(String userValue) {
      Reusable_Actions_POM_Loggers.sendKeysAction(driver, searchAddress ,userValue,logger, "Search for Address");
    }//end of searchforAddress

    public void setClickonSubmit() {
        Reusable_Actions_POM_Loggers.submitAction(driver, clickonSubmit, logger, "Click On Submit");
    }
    //end of clickonsubmit

    public void setSelecttheAddress () {
        Reusable_Actions_POM_Loggers.clickAction(driver, selecttheAddress, logger, "Select the Address");
    }//end of ClickonOrderNow

}

