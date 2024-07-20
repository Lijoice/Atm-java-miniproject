import java.util.Scanner;

public class atm {
    public static void main(String[] args) {

        int pin = 1234;
        int balance = 10000;

        int addAmount = 0;
        int takeAmount = 0;

        String name;

        try (Scanner scanner = new Scanner(System.in)) {
            // Input from user
            System.out.println("Enter your pin number");

            int password = scanner.nextInt();

            if (password == pin) {
                System.out.println("Enter your name");
                name = scanner.next();
                System.out.println("Welcome " + name);

                while (true) {
                    System.out.println("Press 1 to check your balance");
                    System.out.println("Press 2 to add amount");
                    System.out.println("Press 3 to withdraw amount");
                    System.out.println("Press 4 to take receipt");
                    System.out.println("Press 5 to exit");

                    int opt = scanner.nextInt();
                    switch (opt) {
                        case 1:
                            System.out.println("Your current balance is " + balance);
                            break;

                        case 2:
                            System.out.println("How much amount do you need to add to your account?");
                            addAmount = scanner.nextInt();
                            balance = addAmount + balance;
                            System.out.println("Successfully credited");
                            break;

                        case 3:
                            System.out.println("How much amount do you want to withdraw?");
                            takeAmount = scanner.nextInt();
                            if (takeAmount > balance) {
                                System.out.println("Your balance is insufficient");
                            } else {
                                balance = balance - takeAmount;
                                System.out.println("Successfully withdrawn");
                            }
                            break;

                        case 4:
                            System.out.println("Welcome to MY-ATM");
                            System.out.println("Available Balance is " + balance);
                            System.out.println("Amount deposited: " + addAmount);
                            System.out.println("Amount withdrawn: " + takeAmount);
                            System.out.println("Thanks for using MY-ATM");
                            break;

                        case 5:
                            System.out.println("Thank-You!");
                            return;

                        default:
                            System.out.println("Invalid option, please try again.");
                            break;
                    }
                }
            } else {
                System.out.println("Wrong pin number");
            }
        }
    }
}
