import java.util.Scanner;

public class GuessNumber {
	
    public static void main(String[] args) {

        int ranNum = (int)(Math.random() * 101); // random number between 0 and 100

        try(Scanner sc = new Scanner(System.in)){ // scanner object for reader input

        System.out.println("Guess a number between 0 and 100:"); // prompt user for a guess

        while (true) {
            String input = sc.nextLine();
            if (input.equals("quit")) {
                System.out.println("Game over. The number was " + ranNum);
                break;
            }
        
            else {
                int guess = Integer.parseInt(input); // read the user's guess
{
                if (guess < ranNum) {
                    System.out.println("Too low! Try again:");
                } else if (guess > ranNum) {
                    System.out.println("Too high! Try again:");
                } 
                 else {
                    System.out.println("Congratulations! You guessed the number " + ranNum);
                    break;}
                 }
                }
            }
        }
    }
    }

