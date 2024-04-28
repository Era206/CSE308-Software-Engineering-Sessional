import java.util.ArrayList;

public class Bank {

    private static double internalFund;
    Employees md, s1, s2, c1,c2,c3,c4,c5;
    private static int clock;

    /*public static ArrayList<Accounts> getAcList() {
        return acList;
    }

    public static void setAcList(ArrayList<Accounts> acList) {
        Bank.acList = acList;
    }*/

    public static double getInternalFund() {
        return internalFund;
    }

    public void setInternalFund(double internalFund) {
        this.internalFund = internalFund;
    }

    public static int getClock() {
        return clock;
    }

    public static void setClock(int clock) {
        Bank.clock = clock;
    }


    /*public static boolean loanExist(){
        for(int i=0;i<Bank.acList.size();i++){
            Accounts ac = Bank.acList.get(i);
            if(ac.isLoanApproval()){
                return true;
            }
        }
        return false;
    }*/

    public Bank() {
        internalFund = 1000000;
        clock = 0;
        md=new MD();
        s1=new Officer();
        s2=new Officer();
        c1=new Employees();
        c2=new Employees();
        c3=new Employees();
        c4=new Employees();
        c5=new Employees();
        System.out.println("Bank Created; MD, S1, S2, C1, C2, C3, C4, C5 created");
    }


}
