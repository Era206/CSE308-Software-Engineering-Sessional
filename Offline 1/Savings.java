public class Savings extends Accounts{

    private static double interestRate;

    public Savings() {
        interestRate=0.1;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestrate) {
        interestRate = interestrate/100;
    }

    @Override
    public void withdraw(double withdrawalAmount) {
        double total = getTotalBalance()-withdrawalAmount;
        if(total<1000)
            System.out.println("Invalid transaction; current balance " + getTotalBalance() +"$");
        else
        {
            setTotalBalance(getTotalBalance()-withdrawalAmount) ;
            System.out.println("transaction done; current balance " + getTotalBalance() +"$");
        }
    }

    @Override
    public void loanTaken(double loanAmount) {
        if(loanAmount<=10000){
            //setTotalLoan(getTotalLoan()+loanAmount);
            setLoanApproval(true);
            System.out.println("Loan request successful, sent for approval\n");
        }
        else{
            System.out.println("Loan request not successful\n");
        }
    }

    @Override
    public void depositInterest() {

        double totalBalance = getTotalBalance();
        setTotalBalance(totalBalance- 0.1*getTotalLoan());
        setTotalBalance(totalBalance+totalBalance*getInterestRate());
    }
}
