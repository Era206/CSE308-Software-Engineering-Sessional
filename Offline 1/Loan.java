public class Loan extends Accounts {

    @Override
    public void deposit(int depositamount){
        setTotalLoan(getTotalLoan()-depositamount);
        System.out.println(depositamount + "$ deposited; current loan balance " + getTotalLoan() + "$");
    }
    @Override
    public void withdraw(double withdrawalAmount) {
        System.out.println("Invalid transaction; current loan balance " + getTotalLoan() +"$");
    }

    @Override
    public void loanTaken(double loanAmount) {
        if(loanAmount==(0.05 * getTotalLoan())){
            setTotalLoan(getTotalLoan()+loanAmount);
            System.out.println("Loan request successful, sent for approval\n");

        }
        else{
            System.out.println("Loan request not successful\n");

        }
    }

    @Override
    public void depositInterest() {

    }
}
