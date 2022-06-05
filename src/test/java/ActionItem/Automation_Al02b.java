package ActionItem;

import java.util.ArrayList;

public class Automation_Al02b {

    public static void main(String[] args) {

        //create an array with cities and print only when city is Brooklyn or Manhattan
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Brooklyn");
        cities.add("Queens");
        cities.add("Manhattan");
        cities.add("Staten Island");

        for (int i = 0; i < cities.size(); i++) {
            //with if conditions

            if (cities.get(i) == "Brooklyn") {
                System.out.println("My city is " + cities.get(i));
            } else if (cities.get(i) == "Manhattan") {
                System.out.println("My city is " + cities.get(i));
            }

        }//end of for loop
    }//end of main
}//end of class
