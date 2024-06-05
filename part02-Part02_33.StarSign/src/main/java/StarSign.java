
public class StarSign {

    public static void main(String[] args) {


        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!

        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        int min = 1;
        while (min <= number) {
            System.out.print("*");
            min++;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        int min = 1;
        while (min <= size) {
            printStars(size);
            min++;
        }
    }

    public static void printRectangle(int width, int height) {
        int min = 1;
        while (min <= height) {
            printStars(width);
            min++;
        }
    }

    public static void printTriangle(int size) {
        int min = 1;
        while (min <= size) {
            printStars(min);
            min++;
        }
    }
}
