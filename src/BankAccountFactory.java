
public class BankAccountFactory {

    BankAccount bankAccount;

    public BankAccountFactory(){}
    public BankAccountFactory(int accountType, User user) {

        this.init(accountType, user);

    }

    public void init(int accountType, User user) {
        switch(accountType) {
            case 1:
                this.bankAccount = new SalaryAccount(user.personalId, 0.0);
                break;
            case 2:
                this.bankAccount = new SavingsAccount(user.personalId, 0.0, 2.5);
                break;
        }
    }


    public BankAccount getBankAccount() {
        return this.bankAccount;
    }
}
