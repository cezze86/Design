import java.util.ArrayList;

public class User {

    String personalId;

    ArrayList<BankAccount> bankAccounts = new ArrayList<>();

    public User(String personalId) {
        this.personalId = personalId;
    }

    public void addBankAccount(BankAccount bankAccount) {

        this.bankAccounts.add(bankAccount);

    }

    public BankAccount getBankAccount() {

        return this.bankAccounts.get(0);

    }

    public String getPersonalId(){
        return personalId;
    }


}