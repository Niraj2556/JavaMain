package testing;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account account = new Account("Neeraj", "1234");

        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();
        System.out.print("Enter user PIN: ");
        String userPin = scanner.nextLine();

        if (account.getUserId().equals(userId) && account.checkPin(userPin)) {
            while (true) {
                System.out.println("\nATM Menu:");
                System.out.println("1. View Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Transfer");
                System.out.println("5. View Transactions");
                System.out.println("6. Quit");

                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1 -> System.out.println("Balance: " + account.getBalance());
                    case 2 -> {
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                        System.out.println("Deposit successful");
                    }
                    case 3 -> {
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawalAmount = scanner.nextDouble();
                        account.withdraw(withdrawalAmount);
                    }
                    case 4 -> {
                        System.out.print("Enter recipient's user ID: ");
                        String recipientUserId = scanner.next();
                        System.out.print("Enter transfer amount: ");
                        double transferAmount = scanner.nextDouble();
                        scanner.nextLine();


                        Account recipient = new Account("recipientUserID", "recipientPIN");
                        account.transfer(recipient, transferAmount);
                    }
                    case 5 -> {
                        System.out.println("Transaction History:");
                        account.displayTransactions();
                    }
                    case 6 -> {
                        System.out.println("Quitting ATM");
                        scanner.close();
                        System.exit(0);
                    }
                    default -> System.out.println("Invalid choice");
                }
            }
        } else {
            System.out.println("Invalid user ID or PIN");
        }
    }
}
