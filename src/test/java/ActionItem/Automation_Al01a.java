package ActionItem;

import java.util.ArrayList;

public class Automation_Al01a {

    public static void main(String[] args) {

        // create an Arraylist for countries
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Pakistan");
        countries.add("USA");
        countries.add("Bangladesh");
        countries.add("India");

        // create an Arraylist for countryCode
        ArrayList<Integer> countryCode = new ArrayList<>();
        countryCode.add(111);
        countryCode.add(112);
        countryCode.add(113);
        countryCode.add(114);

        for (int i = 0 ; i < countries.size() ; i++) {

            System.out.println("My country is " + countries.get(i) + " and my country code is " + countryCode.get(i));

        }//end of for loop

    }//end of main

}//end of class
