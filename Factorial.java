import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)){
        System.out.println("Enter a non-negative integer to compute its factorial:");
        int num = sc.nextInt();
        int factorial = 1;

        while (num > 0) {
            factorial = factorial * num;
            num--;
    }
        System.out.println("The factorial is: " + factorial);
}
}
}
