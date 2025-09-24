package sumofints;
import java.util.Scanner;

public class SumOfInts {

    public static void main(String[] args) {
        int x, y, sum; // integer variables
        Scanner sc = new Scanner(System.in); // scanner object for reader input
        System.out.println("What is the first integer?"); //ask user for first integer
        x = sc.nextInt(); //read the provided integer and set variable x to it

        System.out.println("What is the second integer?"); //ask user for second integer
        y = sc.nextInt(); //read the provided integer and set variable y to it

        sum = x + y; //calculate the sum of the two integers
        System.out.println("The sum of " + x + " and " + y + " is " + sum); //print the result
        sc.close(); //close the scanner
    }
}