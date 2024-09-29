
abstract class Bank {

    abstract double getBalance();
}

class BankA extends Bank {
    private double balance = 100;

    @Override
    double getBalance() {
        return balance;
    }
}

class BankB extends Bank {
    private double balance = 150;

    @Override
    double getBalance() {
        return balance;
    }
}

class BankC extends Bank {
    private double balance = 200;

    @Override
    double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        Bank bankA = new BankA();
        Bank bankB = new BankB();
        Bank bankC = new BankC();

        System.out.println("Bank A Balance: $" + bankA.getBalance()); // Output: 100.0
        System.out.println("Bank B Balance: $" + bankB.getBalance()); // Output: 150.0
        System.out.println("Bank C Balance: $" + bankC.getBalance()); // Output: 200.0
    }
}
