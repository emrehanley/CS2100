

public class FindMinMax {
   
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int [] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(args[i + 1]);
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers [i]< min) {
                min = numbers[i];
            }
            if (numbers [i]> max) {
                max = numbers[i];
    }
        }
        System.out.println("The minimum value is: " + min);
        System.out.println("The maximum value is: " + max);
    }
}

