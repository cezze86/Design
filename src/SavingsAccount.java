import java.time.LocalDateTime;

public class SavingsAccount extends BankAccount {

    protected double interestRate;
    protected LocalDateTime lastInterestPayout;


    public SavingsAccount(String personalId, double balance, double interestRate) {

        super(personalId, balance);
        this.interestRate = interestRate;
        System.out.println("Konto1");
    }


}
