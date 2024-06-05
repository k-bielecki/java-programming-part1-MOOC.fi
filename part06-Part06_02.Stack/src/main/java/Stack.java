import java.util.ArrayList;

public class Stack {

    private ArrayList<String> data;

    public Stack() {
        this.data = new ArrayList<>();
    }

    public boolean isEmpty() {
        if (this.data.size() == 0) {
            return true;
        }
        return false;
    }

    public void add (String value) {
        this.data.add(value);
    }

    public ArrayList<String> values() {
        return data;
    }

    public String take() {
        return this.data.remove(this.data.size() - 1);
    }
}
