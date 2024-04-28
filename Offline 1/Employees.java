public class Employees {
    private String jobType;

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public void lookUp(String acName){
        int flag = 0;
        for(int i=0;i<BankWork.acList.size();i++){
            Accounts ac = BankWork.acList.get(i);
            if(acName.equalsIgnoreCase(ac.getName())){
                System.out.println(ac.getName() + "’s current balance " + ac.getTotalBalance() + "$");
                flag = 1;
                break;
            }
        }
        if(flag ==0){
            System.out.println("Account doesn't exist!");
        }
    }

    public void see(){
            System.out.println("You don’t have permission for this operation");
    }

    public void approveLoan(){
        System.out.println("You don’t have permission for this operation");

    }

    public void changeRate(Double interest,String acType){
        System.out.println("You don’t have permission for this operation");
    }
}
