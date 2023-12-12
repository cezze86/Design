

public class SalaryAccount extends BankAccount {

    private  SalaryAccount instance;
    private final DebitCard debitCard;



    public  SalaryAccount(String personalId, double balance) {
        super(personalId, balance);
        this.debitCard = new DebitCard("5050505050", 4304);
    }

    public Boolean buy(int amount)
    {

        if (this.balance > amount) {
            this.balance -= amount;
            return true;
        }
        else {
            return false;
        }
    }


}
