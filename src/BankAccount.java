public class BankAccount {
    private int bankAccountNumber;
    private int balance;

   public boolean isInDebt () {
       return  balance < 0;  }
}
