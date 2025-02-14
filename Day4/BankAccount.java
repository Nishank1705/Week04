import java.util.Scanner;

// Custom Exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException, IllegalArgumentException {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance");
        }
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();
        BankAccount account = new BankAccount(balance);

        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();

        try {
            account.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println("Insufficient balance!");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid amount!");
        } finally {
            scanner.close();
        }
    }
}
