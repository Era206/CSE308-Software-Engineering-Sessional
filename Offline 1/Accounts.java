public abstract class Accounts {

   private String Name;
   private String acType;
   private int initialDeposit;
    //private int depositAmount;
    private  double totalLoan=0;
    private  double totalBalance=0;
    private  boolean loanApproval = false;
    private double loanAmount=0;
    //public int loanApproval = 0;
    private int timePeriod=0;

    public String getName() {
        return Name;
    }

    public String getAcType() {
        return acType;
    }

    public int getInitialDeposit() {
        return initialDeposit;
    }

    public double getTotalLoan() {
        return totalLoan;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public boolean isLoanApproval() {
        return loanApproval;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAcType(String acType) {
        this.acType = acType;
    }

    public void setInitialDeposit(int initialDeposit) {
        this.initialDeposit = initialDeposit;
    }

    public  void setTotalLoan(double totalloan) {
      totalLoan = totalloan;
    }

    public void setTotalBalance(double totalbalance) {
       totalBalance = totalbalance;
    }

    public void setLoanApproval(boolean loanApproval) {
        this.loanApproval = loanApproval;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void createAc(String name, String actype, int initialdeposit){
        Name = name;
        acType = actype;
        initialDeposit = initialdeposit;
        if(actype.equalsIgnoreCase("loan")) {
            totalLoan=initialdeposit;
            System.out.println(acType + " account for " + Name +" Created; initial loan amount " + initialDeposit);
        }
        else if(actype.equalsIgnoreCase("fixedDeposit")){
            if(initialdeposit<100000){
                System.out.println("Account cannot be created!");
            }
            else{
                totalBalance=initialdeposit;
                System.out.println(acType + " account for " + Name +" Created; initial balance " + initialDeposit);
            }
        }
        else {
            totalBalance=initialdeposit;
            System.out.println(acType + " account for " + Name +" Created; initial balance " + initialDeposit);
        }
    }
    public void deposit(int depositamount){
        if(getLoanAmount() <= depositamount){
            setLoanAmount(0);
            totalBalance = totalBalance + depositamount - loanAmount;
        }
        else{
            setLoanAmount(getTotalLoan()-depositamount);
        }
        System.out.println(depositamount + "$ deposited; current balance " + totalBalance + "$");
    }

    public abstract void withdraw(double withdrawalAmount);

    public abstract void loanTaken(double loanAmount);

    public void loanReduce(){
        setLoanApproval(false);
        setTotalLoan(getTotalLoan()+getLoanAmount());
        setTotalBalance(getTotalBalance()+getLoanAmount());
    }


    public void queryDeposit(){

        if(totalLoan!=0)
            System.out.println("Current Balance " + totalBalance+"$, loan " + totalLoan+ "$");
        else
            System.out.println("Current balance " + totalBalance +"\n");
    }

    public abstract void depositInterest();

    public void serviceCharge(){
        if(!acType.equalsIgnoreCase("loan"))
            totalBalance = totalBalance - 500;
    }


    public void setTimePeriod(int time) {
        timePeriod=time;
    }

    public int getTimePeriod() {
        return timePeriod;
    }
}
