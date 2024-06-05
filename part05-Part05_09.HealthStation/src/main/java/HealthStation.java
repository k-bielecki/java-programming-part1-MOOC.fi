
public class HealthStation {

    private int countingWieghings;

    public HealthStation() {
        this.countingWieghings = 0;
    }


    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        countingWieghings++;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings() {

        return countingWieghings;
    }

}
