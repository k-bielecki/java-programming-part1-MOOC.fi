import java.util.ArrayList;

public class Hold {

    private int maxWeight;

    private ArrayList<Suitcase> suitcases;

    public Hold (int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public int totalWeight() {
        int sumOfWeights = 0;
        for (Suitcase suitcase : suitcases) {
            sumOfWeights += suitcase.totalWeight();
        }
        return sumOfWeights;
    }

    public void addSuitcase (Suitcase suitcase) {

        if (totalWeight() + suitcase.totalWeight() <= maxWeight) {
            suitcases.add(suitcase);
        }
    }

    public String toString() {
        return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }

    public void printItems() {

        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }
}
