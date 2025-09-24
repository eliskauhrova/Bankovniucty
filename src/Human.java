import java.util.ArrayList;
import java.util.List;

class Human {
    private String name;
    private List<BankAccount> accounts;

    public Human(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }

  
}
