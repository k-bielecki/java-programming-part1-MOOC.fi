public class Container {
    private int totalAmount;
    private int maxAmount;

    public Container() {
        this.totalAmount = 0;
        this.maxAmount = 100;
    }

    public int contains() {
        return totalAmount;
    }

    public void add (int amount) {
        if (amount >= 0) {
            if (totalAmount + amount <= maxAmount) {
                totalAmount += amount;
            } else {
                totalAmount = maxAmount;
            }
        }
    }

    public void remove (int amount) {

        if (amount >= 0) {
            if (totalAmount - amount >= 0) {
                totalAmount -= amount;
            } else {
                totalAmount = 0;
            }
        }
    }

    public String toString() {
        return totalAmount + "/" + maxAmount;
    }
}
