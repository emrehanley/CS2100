import java.util.Scanner;

public class PrimeNumber {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a positive integer:");
            int num = sc.nextInt();
            int numRt = (int) Math.sqrt(num);

            if (num == 1) {
                System.out.println(num + " is not a prime number.");
                return;
            }

            if (num == 2 || num == 3) {
                System.out.println(num + " is a prime number.");
                return;
            }
            boolean isPrime = true;

            for (int i = 2; i <= numRt; i++) {
                
                if (num % i == 0) {
                    isPrime = false;
                    break;
                } 
            }
            if (isPrime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }
    }
}

