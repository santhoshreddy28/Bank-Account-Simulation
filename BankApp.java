import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SavingsAccount account =
                new SavingsAccount(
                        "Santhosh Reddy",
                        12345,
                        5000);

        int choice;

        do {

            System.out.println(
                    "\n===== SECURE BANKING SYSTEM =====");

            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");

            System.out.print(
                    "Enter Choice: ");

            choice = sc.nextInt();

            switch(choice) {

                case 1:

                    System.out.print(
                            "Enter Amount: ₹");

                    double deposit =
                            sc.nextDouble();

                    account.deposit(deposit);

                    break;

                case 2:

                    System.out.print(
                            "Enter Amount: ₹");

                    double withdraw =
                            sc.nextDouble();

                    account.withdraw(withdraw);

                    break;

                case 3:

                    account.showBalance();

                    break;

                case 4:

                    account.showTransactions();

                    break;

                case 5:

                    System.out.println(
                            "Thank you for banking with us.");
                    break;

                default:

                    System.out.println(
                            "Invalid Choice.");
            }

        } while(choice != 5);

        sc.close();
    }
}
