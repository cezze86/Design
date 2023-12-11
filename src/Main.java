public class Main {

    public static void main(String[] args) {

        System.out.println("Hello");

        System.out.println("Skriv 1 eller 2 för ett CheckingAccount(1) eller SavingAccount");

        BankAccountFactory baf = new BankAccountFactory(1, new User("603580"));


    }
}
