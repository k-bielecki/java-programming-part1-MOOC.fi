import java.util.ArrayList;
import java.util.Iterator;

public class Package {

    private ArrayList<Gift> gifts;

    public Package () {
        this.gifts = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        gifts.add(gift);
    }

    public int totalWeight() {
        int weight = 0;

        for (Gift total : gifts) {
            weight += total.getWeight();
        }

        return weight;
    }
}
