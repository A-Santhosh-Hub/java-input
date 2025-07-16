import java.util.Scanner;
class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 1000.00; // Starting balance
        int choice;

        System.out.println("=== Welcome to Simple ATM ===");

        while (true) {
            System.out.println("\n----- ATM Menu -----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Your current balance is ₹%.2f\n", balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = sc.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.printf("₹%.2f deposited successfully.\n", depositAmount);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = sc.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.printf("₹%.2f withdrawn successfully.\n", withdrawAmount);
                    } else {
                        System.out.println("Invalid or insufficient balance.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using Simple ATM. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please enter 1 to 4.");
            }
        }
    }
}
