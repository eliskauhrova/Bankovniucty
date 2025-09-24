
class BankAccount {
    private String accountNumber;
    private Human owner;
    private Bank bank;
    private double balance;

    public BankAccount(String accountNumber, Human owner, Bank bank, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.bank = bank;
        this.balance = balance;

        owner.addAccount(this);
        bank.addAccount(this);
    }



    public boolean isInDebt() {
        return balance < 0;
    }

    public double getBalance() {
        return balance;
    }

    public Human getOwner() {
        return owner;
    }


}
