
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Archive> main = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String inputIdentifier = scanner.nextLine();

            if (inputIdentifier.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String inputName = scanner.nextLine();


            if (inputName.isEmpty() ) {
                break;
            }

            Archive archive = new Archive(inputIdentifier, inputName);


            if (!(main.contains(archive))) {
                main.add(archive);
            }
            
        }


        System.out.println("==Items==");
        for (Archive printer : main) {
            System.out.println(printer);
        }


    }
}
