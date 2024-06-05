import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> TodoList;

    public TodoList() {
        this.TodoList = new ArrayList<>();
    }

    public void add (String task) {
        TodoList.add(task);
    }

    public void print() {

        for (int i = 0; i < TodoList.size(); i++) {
            System.out.println(i+1 + ": " + TodoList.get(i));
        }
    }

    public void remove(int number) {
        TodoList.remove(number - 1);
    }
}
