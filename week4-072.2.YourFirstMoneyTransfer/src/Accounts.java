
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account matAccount = new Account("Matt's account", 1000);
        Account myAccount = new Account("My account", 0);
        matAccount.withdrawal(100.0);
        myAccount.deposit(100.0);
        System.out.println(matAccount + "\n" + myAccount);
    }

}
