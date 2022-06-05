package ActionItem;

public class Automation_Al02a {

    public static void main(String[] args) {

        int grade = 67;

        //When grade range is from 90 to 100 print grade as A
        //When grade range is from 80 to 89 print grade as B
        //When grade range is from 70 to 79 print grade as C
        //When grade range is from 60 to 69 print grade as D
        //When grade range is below 60 print grade as F

        if(grade >= 90 && grade <= 100){
            System.out.println ("grade A");
        } else if(grade >= 80 && grade <= 90){
            System.out.println( "grade B");
        } else if(grade >= 70 && grade <= 80){
            System.out.println( "grade C");
        } else if(grade >= 60 && grade <= 70) {
            System.out.println("grade D");
        } else {
            System.out.println("grade F");
        }//end of conditions

    }//end of method
}//end of class

