
public class Reformatory {

    private int weigthMeasurmentCounter;

    public void Refarmatory() {
        this.weigthMeasurmentCounter = 0;
    }

    public int weight(Person person) {
        // return the weight of the person
        this.weigthMeasurmentCounter++;
        return person.getWeight();
    }

    public void feed(Person h) {
        int weight = h.getWeight();
        h.setWeight(weight + 1);
    }

    public int totalWeightsMeasured() {
        return this.weigthMeasurmentCounter;
    }
}
