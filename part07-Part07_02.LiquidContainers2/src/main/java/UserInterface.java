import java.util.Scanner;

public class UserInterface {

    private Container container1;
    private Container container2;
    private Scanner scanner;

    public UserInterface(Container container1, Container container2, Scanner scanner) {
        this.container1 = container1;
        this.container2 = container2;
        this.scanner = scanner;
    }

    public void printContainers(Container container1, Container container2) {
        System.out.println("First: " + container1);
        System.out.println("Second: " + container2);
    }

    public void start() {
        while (true) {
            printContainers(container1, container2);

            String userInput = scanner.nextLine();

            if (userInput.equals("quit")) {
                break;
            } else {
                this.processCommand(userInput);
            }
        }
    }

    public void processCommand(String input) {
        String[] parts = input.split(" ");
        String command = parts[0];
        int value = Integer.valueOf(parts[1]);

        if (command.equals("add")) {
            container1.add(value);
        }

        if (command.equals("remove")) {
            container2.remove(value);
        }

        if (command.equals("move")) {
            this.move(value);
        }
    }

        public void move(int inputAmount) {
            if (inputAmount >= 0) {
                if ((container1.contains() - inputAmount) >= 0) {
                    container1.remove(inputAmount);
                    container2.add(inputAmount);

                } else if ((container1.contains() - inputAmount) < 0) {
                    container2.add(container1.contains());
                    container1.remove(container1.contains());
                }
            }
        }
}

