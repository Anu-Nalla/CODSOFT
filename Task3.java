import java.util.Scanner;

class Atm {
    private int balance; 

    public Atm(int initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount for deposit.");
            return;
        }
        balance += amount;
        System.out.println("Successfully deposited " + amount + ".");
    }

    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount for withdrawal.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return;
        }
        balance -= amount;
        System.out.println("Successfully withdrawn " + amount + ".");
    }

    public int checkBalance() {
        return balance;
    }
    public void displayMenu() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    int depositAmount = sc.nextInt();
                    deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    int withdrawAmount = sc.nextInt();
                    withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Your balance: " + checkBalance());
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM. Goodbye!");
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        sc.close();
    }
}

public class Task3 {
    public static void main(String[] args) {
        final int INITIAL_BALANCE = 5000;                  
        Atm atm = new Atm(INITIAL_BALANCE);
        atm.displayMenu();
    }
}