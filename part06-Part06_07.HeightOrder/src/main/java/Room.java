import java.util.ArrayList;

public class Room {

    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add (Person person) {
        persons.add(person);
    }

    public boolean isEmpty() {
        return persons.size() == 0;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public Person shortest() {
        if (persons.isEmpty()) {
            return null;
        }

        Person shortestPerson = this.persons.get(0);

        for (Person prs : this.persons) {
            if (shortestPerson.getHeight() > prs.getHeight()) {
                shortestPerson = prs;
            }
        }
        return shortestPerson;
    }

    public Person take() {
        if (persons.isEmpty()) {
            return null;
        }

        int index = persons.indexOf(shortest());

        return persons.remove(index);
    }
}
