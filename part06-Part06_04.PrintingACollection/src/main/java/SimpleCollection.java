
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        if (elements.isEmpty()) {
            return "The collection " + this.name +  " is empty.";
        }

        String printValues = "";

        for (String character : elements) {

            if (elements.size() > 1) {
                printValues = printValues + character + "\n";
            } else {
                printValues = character;
            }
        }

        String elementString = "";

        if (elements.size() > 1) {
            elementString = "elements:\n";
        } else {
            elementString = "element:\n";
        }

        return "The collection " + this.name + " has " + elements.size() + " " + elementString + printValues;


    }
    
}
