package Day2_042422;

public class whileLoop {

    public static void main(String[] args) {

        //iterate through zipcode and its streetNumber using linear array and while loop
        String[] zipCodes = new String[]{"11218", "11219", "11232", "10001"};
        int[] houseNumber = new int[]{111, 222, 333, 444};

        //initialize your starting point before calling while loop
        int i = 0;
        //define the end point in the while loop
        while (i < houseNumber.length) {
            System.out.println("my zipcode is " + zipCodes[i] + " and house number " + houseNumber[i]);

            //incrementing
            i = i + 1;


        }//end of loop

    }//end of main

}//end of while
