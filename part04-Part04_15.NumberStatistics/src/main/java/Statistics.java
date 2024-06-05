
public class Statistics {

    private int count;
    private int sum;

    public Statistics() {
        this.sum = 0;
    }

    public void addNumber (int number) {
        this.sum = this.sum + number;
        this.count++;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        if (count > 0) {
            return 1.0 * sum / count;
        } else {
            return 0.0;
        }
    }

}
