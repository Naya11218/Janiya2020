package ActionItem;

import PageObjects.BaseClass;
import ResuableClasses.Reusable_Annotation_Class;
import org.testng.annotations.Test;

public class Chickfila_POM extends Reusable_Annotation_Class {

    @Test
    public void ClickOnOrderNowPage() {
        driver.navigate().to("https://www.chick-fil-a.com");
        BaseClass.chickfilaHomePage().ClickonOrderNow();
        BaseClass.chickfilaHomePage().ClickonPickUp();
        BaseClass.chickfilaHomePage().setSearchforAddress("11218");
        BaseClass.chickfilaHomePage().setClickonSubmit();
        BaseClass.chickfilaHomePage().setSelecttheAddress();
    }

}//end of class
