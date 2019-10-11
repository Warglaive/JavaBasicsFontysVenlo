
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        double eurosSum = this.euros + added.euros;
        double centsSum = this.cents + added.cents;
        return new Money((int) eurosSum, (int) centsSum);
    }

    public boolean less(Money c) {
        boolean result = false;
        if (this.euros < c.euros) {
            result = true;
        } else if (this.euros > c.euros) {
            result = false;
        }
        if (this.euros == c.euros) {
            if (this.cents < c.cents) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }

    public Money minus(Money d) {
//        double firstMoney = this.euros + this.cents;
//        double nextMoney = decremented.euros + decremented.cents;
//        double result = firstMoney - nextMoney;
        double tempCents = 0;
        double tempEur = 0;

        double finalCents = 0;
        double finalEur = 0;

        tempEur = this.euros - d.euros; //10 - 7 == 3
        tempCents = this.cents - d.cents; //0 - 40 == -40
        if (tempCents < 0) {
            tempEur--;
            finalCents = 100 - Math.abs(tempCents);
        } else {
            finalCents = tempCents;
        }
        finalEur = tempEur;
        if (finalEur < 0) {
            finalEur = 0;
            finalCents = 0;
        }
       
        return new Money((int) finalEur, (int) finalCents);
    }
}
