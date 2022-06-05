package ActionItem;

import ReusableLibraries.Reusable_Actions;
import com.sun.source.tree.TryTree;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class Automation_Al5 {
    public static void main(String[] args) throws InterruptedException {

        //setting the local driver to reusable setDriver method
        WebDriver driver = Reusable_Actions.setDriver();

        ArrayList<String> firstName = new ArrayList<String>();
        firstName.add("Nayab");
        firstName.add("Shimra");
        firstName.add("Hoor");

        ArrayList<String> lastName = new ArrayList<String>();
        lastName.add("Khan");
        lastName.add("Shah");
        lastName.add("Zamaan");

        ArrayList<String> birthMonth = new ArrayList<String>();
        birthMonth.add("December");
        birthMonth.add("July");
        birthMonth.add("April");

        ArrayList<String> birthday = new ArrayList<String>();
        birthday.add("21");
        birthday.add("22");
        birthday.add("14");

        ArrayList<String> birthYear = new ArrayList<String>();
        birthYear.add("1994");
        birthYear.add("1995");
        birthYear.add("1996");

        ArrayList<String> zipCode = new ArrayList<String>();
        zipCode.add("11218");
        zipCode.add("11217");
        zipCode.add("11219");

        ArrayList<String> memberId = new ArrayList<String>();
        memberId.add("12345");
        memberId.add("23456");
        memberId.add("34567");

        for (int i = 0; i < firstName.size(); i++) {

            //navigate t usps
            driver.navigate().to("https://www.UHC.com");
            Thread.sleep(3000);

            //capture the title of the page and compare it with your expected title 'UHC'

            Reusable_Actions.verifyTitle(driver, "UHC");


            //click on 'Find a Doctor' link

            try {
                driver.findElements(By.xpath("//*[@href=\"/find-a-doctor\"]")).get(0).click();
            } catch (Exception e) {
                //print out the exception
                System.out.println("Unable to locate " + e);
            }

            //Click on 'Sign in'

            try {
                driver.findElements(By.xpath("//*[@aria-label=\"Sign in menu\"]")).get(0).click();
            } catch (Exception e) {
                //print out the exception
                System.out.println("Unable to locate " + e);
            }


            //click on Medicare plan

            try {
                driver.findElements(By.xpath("//*[@aria-label=\"Medicare plan? Sign in to Medicare member site Opens a new window\"]")).get(0).click();
            } catch (Exception e) {
                //print out the exception
                System.out.println("Unable to locate " + e);
            }

            //New tab opens up

            Reusable_Actions.switchToTabByIndex(driver, 1);

            //Click on Register Now

            try {
                driver.findElements(By.xpath("//*[@class=\"uhc-tempo-link uhc-tempo-link--medium registerBtn ng-scope\"]")).get(0).click();
            } catch (Exception e) {
                //print out the exception
                System.out.println("Unable to locate " + e);
            }


//enter firstName
            try {
                WebElement firstNameSearch = driver.findElement(By.xpath("//*[@id='firstName']"));
                firstNameSearch.clear();
                firstNameSearch.sendKeys(firstName.get(i));
                Thread.sleep(1000);

            } catch (Exception e) {
                //print out the exception
                System.out.println("Unable to clear " + e);
            }
// enter last name

            try {
                WebElement lastNameSearch = driver.findElement(By.xpath("//*[@id='lastName']"));
                lastNameSearch.clear();
                lastNameSearch.sendKeys(lastName.get(i));
                Thread.sleep(1000);

            } catch (Exception e) {
                //print out the exception
                System.out.println("Unable to clear " + e);
            }

            // enter birthMonth
            try {
                Reusable_Actions.selectByText(driver, "//*[@id='dob_month_input']", birthMonth.get(i));

            } catch (Exception e) {
                //print out the exception
                System.out.println("Unable to clear " + e);
            }

            // enter birthday
            try {
                WebElement birthdaySearch = driver.findElement(By.xpath("//*[@id='dob_day']"));
                birthdaySearch.clear();
                birthdaySearch.sendKeys(birthday.get(i));
                Thread.sleep(1000);

            } catch (Exception e) {
                //print out the exception
                System.out.println("Unable to clear " + e);
            }

            // enter birthYear
            try {
                WebElement birthYearSearch = driver.findElement(By.xpath("//*[@id='dob_year']"));
                birthYearSearch.clear();
                birthYearSearch.sendKeys(birthYear.get(i));
                Thread.sleep(1000);

            } catch (Exception e) {
                //print out the exception
                System.out.println("Unable to clear " + e);
            }

            // enter zipcode
            try {
                WebElement zipcodeSearch = driver.findElement(By.xpath("//*[@id='zipCode']"));
                zipcodeSearch.clear();
                zipcodeSearch.sendKeys(zipCode.get(i));
                Thread.sleep(1000);

            } catch (Exception e) {
                //print out the exception
                System.out.println("Unable to clear " + e);
            }

            // enter memberID
            try {
                WebElement memberIDsearch = driver.findElement(By.xpath("//*[@id='memberId']"));
                memberIDsearch.clear();
                memberIDsearch.sendKeys(memberId.get(i));
                Thread.sleep(1000);

            } catch (Exception e) {
                //print out the exception
                System.out.println("Unable to clear " + e);
            }

//click on continue
            try {
                driver.findElement(By.xpath("//*[@id='submitBtn']")).click();
            } catch (Exception e) {
                //print out the exception
                System.out.println("Unable to clear " + e);
            }

            //printout errorMessage
            Thread.sleep(1000);
            System.out.println(Reusable_Actions.captureText(driver, "//*[@id=\"plainText_error\"]"));





        }//end of for loop

        Reusable_Actions.switchToTabByIndex(driver, 1);

        driver.close();

    }//end of main
}//end of class
