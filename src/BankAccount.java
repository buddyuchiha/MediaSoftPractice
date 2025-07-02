import java.time.LocalDateTime;

public class BankAccount {
    private String ownerName;
    private int balance;
    private LocalDateTime openDate;
    private boolean isBlocked;

    public BankAccount(String ownerName) {
        this.ownerName = ownerName;
        this.balance = 0;
        this.openDate = LocalDateTime.now();
        this.isBlocked = false;
    }

    public boolean deposit(int amount) {
        if (amount <= 0 || isBlocked) {
            return false;
        }
        balance += amount;
        return true;
    }

    public boolean withdraw(int amount) {
        if (amount <= 0 || isBlocked || amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public boolean transfer(BankAccount otherAccount, int amount) {
        if (amount <= 0 || isBlocked || amount > balance || otherAccount.isBlocked) {
            return false;
        }
        balance -= amount;
        otherAccount.balance += amount;
        return true;
    }
}