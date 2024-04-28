import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        BankWork bank = new BankWork();
        Scanner s = new Scanner(System.in);
        while(true)
        {
            if(bank.isBankRupt()){
                System.out.println("Bank is bankrupt");
                break;
            }
            String input = s.nextLine();
            bank.output(input);
        }

    }
}
