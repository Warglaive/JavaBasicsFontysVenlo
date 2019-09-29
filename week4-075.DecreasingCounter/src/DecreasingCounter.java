
public class DecreasingCounter {

    private int value;  // instance variable that remembers the value of the counter
    private int initialValue;

    public DecreasingCounter(int valueAtStart) {
        this.initialValue = valueAtStart;
        if (valueAtStart >= 0) {
            this.value = valueAtStart;
        }
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        if (this.value <= 0) {
            this.value = 0;
        } else {
            this.value--;
        }
    }

    public void reset() {
        this.value = 0;
    }

    public void setInitial() {
        this.value = this.initialValue;
    }
    // and here the rest of the methods
}
