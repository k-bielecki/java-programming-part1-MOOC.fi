
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int numbersofNumbers = 0;
        int even = 0;
        int odd = 0;

        while (true) {
            System.out.println("Give numbers:");
            int number = scanner.nextInt();

            if (number == -1) {
                System.out.println("Thx! Bye!");
                break;
            }

            if (number % 2 == 0) {
                even++;
            }

            if (number % 2 != 0) {
                odd++;
            }
            sum += number;
            numbersofNumbers++;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbersofNumbers);
        System.out.println("Average: " + (1.0 * sum / numbersofNumbers));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
