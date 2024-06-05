
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        String name = "";
        int lenght = name.length();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            sum = sum + Integer.valueOf(parts[1]);
            count = count + 1;

            if (lenght < parts[0].length()) {
                lenght = parts[0].length();
                name = parts[0];
            }
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (1.0 * sum / count));

    }


}

