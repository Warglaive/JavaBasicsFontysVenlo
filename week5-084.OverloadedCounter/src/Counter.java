/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Warglaive
 */
public class Counter {

    public int Counter;
    public boolean Check;

    public Counter(int startingValue, boolean check) {
        this.Counter = startingValue;
        this.Check = check;
        if (this.Check) {
            if (this.Counter < 0) {
                this.Counter = 0;
            }
        }
    }

    public Counter(int startingValue) {
        this.Counter = startingValue;
    }

    public Counter(boolean check) {
        this.Check = check;
        if (check) {
            this.Counter = 0;
        }
    }

    public Counter() {
        this.Counter = 0;
    }

    public int value() {
        return this.Counter;
    }

    public void increase() {
        this.Counter++;
    }

    public void decrease() {
        this.Counter--;
        if (this.Check) {
            if (this.Counter < 0) {
                this.Counter = 0;
            }
        }
    }

    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            this.Counter += increaseAmount;
        }
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount > 0) {
            this.Counter -= decreaseAmount;
        }
        if (this.Check) {
            if (this.Counter < 0) {
                this.Counter = 0;
            }
        }
    }
}
