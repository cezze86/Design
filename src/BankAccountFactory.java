public class BankAccountFactory {

    BankAccount bankAccount;

    public BankAccountFactory(int accountType, User user) {

        this.init(accountType, user);

    }

    public void init(int accountType, User user) {
        switch(accountType) {
            case 1:
                this.bankAccount = new CheckingAccount(user.personalId, 0.0);
                break;
            case 2:
                this.bankAccount = new SavingsAccount(user.personalId, 0.0);
                break;
        }
    }

    /*public BankAccount getBankAccount(String accountType) {
        if (accountType == null) {
            return null;
        }
        if (accountType.equalsIgnoreCase("CHECKING")) {
            return new CheckingAccount();
        }
    }*/
}
