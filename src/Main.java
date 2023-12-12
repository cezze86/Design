import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Boolean wantsToContinue = true;
        Boolean wantsToTransfer = false;
        BankAccountFactory baf;
        Scanner scan = new Scanner(System.in);
        User user = new User("603580");

        String input;

        System.out.println("Skriv 1 för att skapa ett 'Lönekonto' eller 2 för ett 'Sparkonto'");
        String inputAccountType = scan.nextLine();


        if (inputAccountType.equals("1") || inputAccountType.equals("2")) {
            baf = new BankAccountFactory(Integer.parseInt(inputAccountType), user);
            user.addBankAccount(baf.getBankAccount());

            System.out.println(inputAccountType);
            System.out.println(baf.bankAccount.creationDate);

            System.out.print("\033[H\033[2J");
        } else{
                System.out.println("Det blev fel. Försök igen, eller vill du avsluta?(J/N)");
                input = scan.nextLine();
                switch (input.toLowerCase()) {
                    case "j":
                        break;

                    case "n":
                        wantsToContinue = false;

                }
            }//End of else clause

        while (wantsToContinue) {


                System.out.println("1. Insättning\n2. Uttag\n3. Se saldo");
                input = scan.nextLine();
                switch (input.toLowerCase()) {
                    case "1":
                        System.out.println("Hur mycket vill du sätta in?");
                        input = scan.nextLine();
                        user.getBankAccount().deposit(Integer.parseInt(input));
                        System.out.println(input + " är nu insatt på ditt konto");

                            break;

                    case "2":
                        System.out.println("Hur mycket vill du ta ut?");
                        input = scan.nextLine();
                        user.getBankAccount().withdraw(Integer.parseInt(input));
                            break;

                    case "3":
                        System.out.println(user.getBankAccount().getBalance());

                }

                displayAccounts(user);


            }//End of first if case clause

        }// First While loop ends here
    //Main method ends here

    public static void displayAccounts(User user)
    {
        int i = 1;
        String message = "";
        if (!user.bankAccounts.isEmpty())
        {
            for (BankAccount bankAccount : user.bankAccounts)
            {
                message += "Bankkontonummer " + i + " har ett saldo på: " + String.format("%.2f", bankAccount.balance) + "\n";
            }
        }
        else {
            message = "Du har inga bankkonton";
        }

        System.out.format(message);
    }
}//Class method ends here






