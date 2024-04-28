public class Officer extends Employees{
    @Override
    public void approveLoan(){
        int flag=0;
        for(int i=0;i<BankWork.acList.size();i++){
            Accounts ac = BankWork.acList.get(i);
            if(ac.isLoanApproval()){
                flag =1;
                ac.loanReduce();
                System.out.println("Loan for " + ac.getName() + " approved");
            }
        }
        if(flag==0){
            System.out.println("no loan is pending for approval");
        }
    }
}
