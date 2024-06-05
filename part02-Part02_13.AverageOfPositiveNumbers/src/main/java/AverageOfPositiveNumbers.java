
import java.util.Scanner;

public class AverageOfPositiveNumbers {

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

            if (number > 0) {
                sum = sum + number;
                numberofNumbers = numberofNumbers + 1;
            }
        }

        double average = 1.0 * sum / numberofNumbers;

        if (sum <= 0) {
            System.out.println("Cannot calculate average");
        } else {
            System.out.println(average);
        }

    }
}
