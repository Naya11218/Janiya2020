package ActionItem;

public class Automation_Al01b {

    public static void main(String[] args) {

        //iterate through region and its areaCode using linear array and while loop
        String[] region  = new String[]{"NY", "CA", "TX", "PA"};
        int[] areaCode = new int[]{212, 213, 214, 215};

        //initialize your starting point before calling while loop
        int i = 0;
        //define the end point in the while loop
        while (i < areaCode.length) {
            System.out.println("my region is " + region[i] + " and area code is " + areaCode[i]);

            //incrementing
            i = i + 1;

        }//end of whileLoop

    }//end of main

}// end of class
