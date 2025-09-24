import java.util.ArrayList;
import java.util.List;

class Bank {
    private String name;
    private List<BankAccount> accounts;

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }


    public double totalBalance() {
        double sum = 0;
        for (BankAccount acc : accounts) {
            sum += acc.getBalance();
        }
        return sum;
    }


    public int clientCount() {
        List<Human> uniqueClients = new ArrayList<>();

        for (BankAccount acc : accounts) {
            Human owner = acc.getOwner();
            boolean exists = false;


            for (Human h : uniqueClients) {
                if (h == owner) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                uniqueClients.add(owner);
            }
        }
        return uniqueClients.size();
    }


}