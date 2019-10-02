
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros 
        this.cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        double lunchPrice = 2.50;
        if (cashGiven >= lunchPrice) {
            this.cashInRegister += lunchPrice;
            this.economicalSold++;
            return (cashGiven - lunchPrice);
        } else {
            return cashGiven;
        }
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens        
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        double lunchPrice = 4.00;
        // if the given cash is at least the price of the lunch:
        if (cashGiven >= lunchPrice) {
            this.cashInRegister += lunchPrice;
            this.gourmetSold++;
            return (cashGiven - lunchPrice);
        } else {
            return cashGiven;
        }
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
    }

    public boolean payEconomical(LyyraCard card) {
        double lunchPrice = 2.50;
        // the price of the economical lunch is 2.50 euros
        if (card.balance() >= lunchPrice) {
            card.pay(lunchPrice);
            this.economicalSold++;
            return true;
        } else {
            return false;
        }
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
    }

    public boolean payGourmet(LyyraCard card) {
        double lunchPrice = 4.00;
        // the price of the gourmet lunch is 4.00 euros
        if (card.balance() >= lunchPrice) {
            card.pay(lunchPrice);
            this.gourmetSold++;
            return true;
        } else {
            return false;
        }
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
