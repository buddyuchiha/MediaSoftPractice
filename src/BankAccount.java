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
}