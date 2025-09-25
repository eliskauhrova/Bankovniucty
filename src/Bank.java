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
        for (int i = 0; i < accounts.size(); i++){
            sum += acc.getBalance();
        }
        return sum;
    }


    public int clientCount() {
        List<Human> uniqueClients = new ArrayList<>();
        for (int i = 0; i < accounts.size(); i++) {
            BankAccount acc = accounts.get(i);
            Human owner = acc.getOwner();
            boolean exists = false;

            for (int j = 0; j < uniqueClients.size(); j++) {
                Human h = uniqueClients.get(j);
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