
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        ArrayList<Integer> numbers = new ArrayList<>();

        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                numbers.add(Integer.valueOf(reader.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        int numberOfNumbers = 0;

        for (int i = lowerBound; i <= upperBound; i++) {
            if (numbers.contains(i)) {
                numberOfNumbers++;
            }
        }

        System.out.println("Numbers: " + numberOfNumbers);

    }

}
