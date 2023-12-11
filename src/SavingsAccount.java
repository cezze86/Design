import java.time.LocalDateTime;

public class SavingsAccount extends BankAccount {

    protected double interestRate;
    protected LocalDateTime lastInterestPayout;
    protected double balance;


    public SavingsAccount(String personalId, double balance) {
        super(personalId, balance);
    }

    public Boolean deposit(double balance){
        return true;
    }

    public Boolean withdraw(double balance) {

        if (this.balance < balance) {
            System.out.println("Insufficient funds");
            return false;
        }
        else {
            this.balance -= balance; //this.balance = this.balance - balance;
            return true;
        }

    }
}
