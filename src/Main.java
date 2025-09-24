public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Česká banka");

        Human alice = new Human("Alice");
        Human bob = new Human("Bob");

        BankAccount acc1 = new BankAccount("123", alice, bank, 10000);
        BankAccount acc2 = new BankAccount("124", alice, bank, -5000); // Alice má účet v dluhu
        BankAccount acc3 = new BankAccount("125", bob, bank, 25000);

        System.out.println(acc2.isInDebt());
        System.out.println(bank.totalBalance());
        System.out.println(bank.clientCount());
    }
}