public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Иван Иванов");
        BankAccount account2 = new BankAccount("Петр Петров");

        boolean depositSuccess = account1.deposit(1000);
        System.out.println("Пополнение счета: " + (depositSuccess ? "Успешно" : "Ошибка"));


        boolean withdrawSuccess = account1.withdraw(500);
        System.out.println("Снятие денег: " + (withdrawSuccess ? "Успешно" : "Ошибка"));

        boolean transferSuccess = account1.transfer(account2, 300);
        System.out.println("Перевод денег: " + (transferSuccess ? "Успешно" : "Ошибка"));

        System.out.println("Счет 1: " + account1);
        System.out.println("Счет 2: " + account2);
    }
}