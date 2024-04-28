public class Student extends Accounts{

    private static double interestRate;

    public Student() {
        interestRate=0.05;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestrate) {
        interestRate = interestrate/100;
    }

    @Override
    public void withdraw(double withdrawalAmount) {
        if(withdrawalAmount> 10000 || getTotalBalance() < withdrawalAmount)
            System.out.println("Invalid transaction; current balance " + getTotalBalance()+"$");
        else
        {
             setTotalBalance(getTotalBalance()-withdrawalAmount);
            System.out.println("transaction done; current balance " + getTotalBalance() +"$");
        }
    }

    @Override
    public void loanTaken(double loanAmount) {
        if(loanAmount<=1000){
            //setTotalLoan(getTotalLoan()+loanAmount);
            setLoanApproval(true);
            setLoanAmount(loanAmount);
            System.out.println("Loan request successful, sent for approval\n");
        }
        else{
            System.out.println("Loan request not successful\n");
        }

    }



    @Override
    public void depositInterest() {
        double totalBalance = getTotalBalance();

        setTotalBalance(totalBalance+totalBalance*getInterestRate()-0.1*getTotalLoan());

    }
}
