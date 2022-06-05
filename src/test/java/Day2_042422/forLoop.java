package Day2_042422;

import java.util.ArrayList;

public class forLoop {

    public static void main(String[] args) {
        //create an arraylist for cities and loop/iterating through all the values using for loop
        ArrayList<String> cities = new ArrayList<>();
        cities.add("brooklyn");
        cities.add("queens");
        cities.add("staten island");
        cities.add("bronx");
        cities.add("manhattan");

        //System.out.println("The size of this array is: " + cities.size());

        // short versions of i = i + 1
        // i++
        //Short version of i = i +3
        //i+=3

        // for (starting point; end point; increment)
        for (int i = 0; i < cities.size(); i++ ) {

            System.out.println("my city is " + cities.get(i));
        }//end of loop

    }//end of main
}//end of class