
public class Clock {

    private final int hoursUpperBorder = 23;
    private final int minutesUpperBorder = 59;
    private final int secondsUpperBorder = 59;

    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;

    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
        this.hours = new BoundedCounter(hoursUpperBorder);
        this.hours.setValue(hoursAtBeginning);
        this.minutes = new BoundedCounter(minutesUpperBorder);
        this.minutes.setValue(minutesAtBeginning);
        this.seconds = new BoundedCounter(secondsUpperBorder);
        this.seconds.setValue(secondsAtBeginning);

    }

    public void tick() {
        // Clock advances by one second
        this.seconds.next();
        if (this.seconds.getValue() == 0) {
            this.minutes.next();
            if (this.minutes.getValue() == 0) {
                this.hours.next();
            }
        }
    }

    public String toString() {
        // returns the string representation
        return this.hours + ":" + this.minutes + ":" + this.seconds;
    }
}
