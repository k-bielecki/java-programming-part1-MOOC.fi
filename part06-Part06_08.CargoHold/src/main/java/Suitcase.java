import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;


    public Suitcase (int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem (Item item) {

        if (totalWeight() + item.getWeight() <= maxWeight) {

            items.add(item);
        }
    }

    public String toString() {

        String print = "";

        if (items.size() == 0) {
            print = "no items (" + totalWeight() + " kg)";
        }else if (items.size() == 1) {
            print = items.size() + " item (" + totalWeight() + " kg)";
        } else {
            print = items.size() + " items (" + totalWeight() + " kg)";
        }
        return print;
    }

    public void printItems() {

        for (Item print : items) {
            System.out.println(print);
        }
    }

    public int totalWeight() {
        int sumOfWeights = 0;

        for (Item entry : items) {
            sumOfWeights += entry.getWeight();
        }
        return sumOfWeights;
    }

    public Item heaviestItem() {

        if(items.isEmpty()) {
            return null;
        }

        Item heaviest = this.items.get(0);

        for (Item printHeaviest : items) {
            if (heaviest.getWeight() < printHeaviest.getWeight()) {
                heaviest = printHeaviest;
            }
        }
        return heaviest;
    }

}
