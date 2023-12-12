import java.util.ArrayList;

public class User {

    String personalId;

    ArrayList<BankAccount> bankAccounts;

    public User(String personalId) {
        this.personalId = personalId;
    }

    public void setBankAccount(BankAccount bankAccount) {

        this.bankAccounts.add(bankAccount);

    }

    public ArrayList<BankAccount> getBankAccount(BankAccount bankAccount) {

        return this.bankAccounts;

    }

    public String getPersonalId(){
        return personalId;
    }


}
