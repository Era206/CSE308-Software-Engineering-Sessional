public class FixedDeposit extends Accounts {

    private static double interestRate;


    public FixedDeposit() {
        interestRate=1.5;

    }


    public double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestrate) {
        interestRate = interestrate/100;
    }

    @Override
    public void deposit(int depositamount){
        if(depositamount>=50000){
            if(getLoanAmount() <= depositamount){
                setLoanAmount(0);
                setTotalBalance(getTotalBalance()+depositamount-getLoanAmount());
            }
            else{
                setLoanAmount(getTotalLoan()-depositamount);
            }
            System.out.println(depositamount + "$ deposited; current balance " + getTotalBalance() + "$");
        }
        else{
            System.out.println("invalid deposit amount for fixedDeposit purpose!");
        }
    }

    @Override
    public void withdraw(double withdrawalAmount) {
        if(getTimePeriod()<1 || getTotalBalance() < withdrawalAmount)
            System.out.println("Invalid transaction; current balance " + getTotalBalance()+"$");
        else{
            setTotalBalance(getTotalBalance()-withdrawalAmount);
            System.out.println("transaction done; current balance " + getTotalBalance() +"$");
        }

    }

    @Override
    public void loanTaken(double loanAmount) {
        if(loanAmount<=100000){
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
