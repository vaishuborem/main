public class SavingsAccount {
    private double savingsBalance;
    private static double annualInterestRate;

    public SavingsAccount(double balance) {
        this.savingsBalance = balance;
    }

    public void calculateMonthlyInterest() {
        savingsBalance += (savingsBalance * annualInterestRate) / 12;
    }

    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    public static void main(String[] args) {
        modifyInterestRate(0.04);

        SavingsAccount saver1 = new SavingsAccount(2000);
        saver1.calculateMonthlyInterest();
        System.out.println("Saver 1 Balance: $" + saver1.savingsBalance);
    }
}
