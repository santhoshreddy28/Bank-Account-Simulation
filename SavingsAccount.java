public class SavingsAccount extends Account {

    public SavingsAccount(String accountHolder,
                          int accountNumber,
                          double balance) {

        super(accountHolder,
              accountNumber,
              balance);
    }

    @Override
    public void withdraw(double amount) {

        if(balance - amount < 500) {

            System.out.println(
                    "Minimum balance of ₹500 required.");
        }
        else {

            super.withdraw(amount);
        }
    }
}
