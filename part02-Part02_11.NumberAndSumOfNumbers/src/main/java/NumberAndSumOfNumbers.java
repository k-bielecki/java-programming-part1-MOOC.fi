
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int numberofNumbers = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            sum = sum + number;
            numberofNumbers = numberofNumbers + 1;
        }

        System.out.println("Number of numbers: " + numberofNumbers);
        System.out.println("Sum of the numbers: " + sum);

    }
}
