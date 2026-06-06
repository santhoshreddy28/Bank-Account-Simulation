import java.util.ArrayList;

public class Account {

    protected String accountHolder;
    protected int accountNumber;
    protected double balance;

    protected ArrayList<String> transactions =
            new ArrayList<>();

    public Account(String accountHolder,
                   int accountNumber,
                   double balance) {

        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {

        if(amount > 0) {

            balance += amount;

            transactions.add(
                    "Deposited ₹" + amount);

            System.out.println(
                    "₹" + amount +
                    " deposited successfully.");
        }
    }

    public void withdraw(double amount) {

        if(amount > 0 && amount <= balance) {

            balance -= amount;

            transactions.add(
                    "Withdrawn ₹" + amount);

            System.out.println(
                    "₹" + amount +
                    " withdrawn successfully.");
        }
        else {

            System.out.println(
                    "Insufficient Balance!");
        }
    }

    public void showBalance() {

        System.out.println(
                "Current Balance: ₹" + balance);
    }

    public void showTransactions() {

        System.out.println(
                "\n===== TRANSACTION HISTORY =====");

        if(transactions.isEmpty()) {

            System.out.println(
                    "No transactions found.");
            return;
        }

        for(String transaction : transactions) {

            System.out.println(transaction);
        }
    }
}
