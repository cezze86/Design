import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BankAccountFactory baf;
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello");
        while(true) {
            System.out.println("Skriv 1 för att skapa ett 'Lönekonto' eller 2 för ett 'Sparkonto'");
            String inputAccountType = scan.nextLine();


            if(inputAccountType.equals("1") || inputAccountType.equals("2")){
                baf = new BankAccountFactory(Integer.parseInt(inputAccountType), new User("603580"));

                System.out.println(inputAccountType);
                System.out.println(baf.bankAccount.creationDate);

                switch (inputAccountType) {

                    case "deposit":
                    System.out.println("Hur mycket vill du sätta in?");
                        String input = scan.nextLine();
                        baf.bankAccount.deposit(Integer.parseInt(input));
                        break;
                    case "withdraw":
                        System.out.println("Hur mycket vill du ta ut?");
                        input = scan.nextLine();
                        baf.bankAccount.deposit(Integer.parseInt(input));
                        break;
                }
            } else {
                System.out.println("Det blev fel. Försök igen, eller vill du avsluta?(J/N)");
                input = scan.nextLine();
                switch (input.toLowerCase()) {
                    case "j":
                        break;

                    case "n":
                        continue;
                }
            }
        }
    }
}




        }

    Boolean deposit(BankAccountFactory baf, double balance) {

        return baf.bankAccount.deposit(balance);

    }
}
