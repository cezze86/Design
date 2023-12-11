import java.time.LocalDateTime;

public abstract class BankAccount {


    String personalId;
    double balance;
    LocalDateTime creationDate;

    public BankAccount(String personalId, double balance)
    {

        this.personalId = personalId;
        this.balance = balance;
        this.creationDate = LocalDateTime.now();

    }

    public String getPersonalId() {
        return personalId;
    }

    public double getBalance() {
        return balance;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public Boolean deposit(double balance) {

        this.balance += balance;
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
