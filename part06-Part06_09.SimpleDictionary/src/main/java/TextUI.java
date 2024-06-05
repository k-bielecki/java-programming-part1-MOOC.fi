import java.util.Scanner;

public class TextUI {

    private SimpleDictionary simpleDictionary;
    private Scanner scanner;

    public TextUI (Scanner scanner, SimpleDictionary simpleDictionary) {
        this.simpleDictionary = simpleDictionary;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String userInput = scanner.nextLine();

            if (userInput.equals("end")) {
                System.out.println("Bye bye!");
                break;

            } else if (userInput.equals("add")) {
                System.out.println("Word:");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String tranlation = scanner.nextLine();
                simpleDictionary.add(word, tranlation);

            } else if (userInput.equals("search")) {
                System.out.println("To be translated:");
                String serach = scanner.nextLine();

                if (simpleDictionary.translate(serach) == null) {
                    System.out.println("Word " + serach + " was not found");
                } else {
                    System.out.println("Translation: " + simpleDictionary.translate(serach));
                }

            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
