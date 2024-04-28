//import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class BankWork {
    Bank bank = new Bank();
    boolean activeAC = false;
    boolean isID = false;
    static int currectAc = 0;
    static int isAcActive = 0;
    static int isBankActive =0;
    static  String currentEmployee;
    Employees currEmp;
    static ArrayList<Accounts> acList = new ArrayList<>();

    public static boolean loanExist(){
        for(int i=0;i<acList.size();i++){
            Accounts ac = acList.get(i);
            if(ac.isLoanApproval()){
                return true;
            }
        }
        return false;
    }

    public boolean isBankRupt(){
        return bank.getInternalFund()<= 10000;
    }

    public void output(String input){
        String[] action = input.split(" ");

        if(action[0].equalsIgnoreCase("create")&& isBankActive==0 && isAcActive==0){
            for(int i=0;i<acList.size(); i++){
                if(action[1].equalsIgnoreCase(acList.get(i).getName())){
                    System.out.println("Account cannot be created");
                    isID = true;
                    break;
                }
            }
            if(isID==false){
                String name = action[1];
                String acType;
                int initialDeposit;
                int flag = 0;
                if(action[2].equalsIgnoreCase("Student")){
                    acList.add(new Student());
                }
                else if(action[2].equalsIgnoreCase("Savings")){
                    acList.add(new Savings());
                }
                else if(action[2].equalsIgnoreCase("loan")){
                    acList.add(new Loan());
                }
                else if(action[2].equalsIgnoreCase("fixed")){
                    acList.add(new FixedDeposit());
                }
                else{
                    System.out.println("account type not valid");
                    flag = 1;
                }

                if(flag==0){
                    currectAc = acList.size()-1;

                    if(action[3].equalsIgnoreCase("deposit")){
                        acType = "fixedDeposit";
                        initialDeposit = Integer.parseInt(action[4]);
                    }
                    else{
                        acType = action[2];
                        initialDeposit = Integer.parseInt(action[3]);
                    }
                    acList.get(acList.size()-1).createAc(name, acType,initialDeposit);
                    bank.setInternalFund(bank.getInternalFund()+initialDeposit);
                    isAcActive=1;
                }
            }

        }
        else if(action[0].equalsIgnoreCase("deposit") && isBankActive==0 && isAcActive==1){
            int deposit = Integer.parseInt(action[1]);
            acList.get(currectAc).deposit(deposit);
            bank.setInternalFund(bank.getInternalFund()+deposit);
        }
        else if(action[0].equalsIgnoreCase("withdraw")&& isBankActive==0 && isAcActive==1){
            int withdraw = Integer.parseInt(action[1]);
            acList.get(currectAc).withdraw(withdraw);
            bank.setInternalFund(bank.getInternalFund()+withdraw);
        }
        else if(action[0].equalsIgnoreCase("query")&& isBankActive==0 && isAcActive==1){
            acList.get(currectAc).queryDeposit();
        }
        else if(action[0].equalsIgnoreCase("Request")&& isBankActive==0 && isAcActive==1){
            acList.get(currectAc).loanTaken(Integer.parseInt(action[1]));
        }
        else if(action[0].equalsIgnoreCase("close")){
            if(isAcActive==1){
                isAcActive=0;
                String name = acList.get(currectAc).getName();
                System.out.println("Transaction Closed for " + name);
            }
            else if(isBankActive==1){
                isBankActive=0;
                System.out.println("Operations for " + currentEmployee +" closed");
            }
            else{
                System.out.println("Invalid Command!");
            }
        }
        else if(action[0].equalsIgnoreCase("open")&& isBankActive==0 && isAcActive==0 ){
            String[] employees = {"MD", "O1", "O2", "C1", "C2", "C3", "C4", "C5"};
            int isDone =0;
            for(int i=0;i<8;i++){
                if(action[1].equalsIgnoreCase(employees[i])){
                    currentEmployee = employees[i];
                    isDone=1;
                    isBankActive=1;
                    System.out.print(employees[i] + " active");
                    if(loanExist() && (currentEmployee=="O1" || currentEmployee=="O2" || currentEmployee =="MD"))
                        System.out.println(",there are loan approvals pending");

                    if(currentEmployee.equalsIgnoreCase("md"))
                        currEmp = bank.md;
                    else if(currentEmployee.equalsIgnoreCase("O1"))
                            currEmp = bank.s1;
                    else if(currentEmployee.equalsIgnoreCase("O2"))
                        currEmp = bank.s2;
                    else if(currentEmployee.equalsIgnoreCase("C1"))
                        currEmp = bank.c1;
                    else if(currentEmployee.equalsIgnoreCase("C2"))
                        currEmp = bank.c2;
                    else if(currentEmployee.equalsIgnoreCase("C3"))
                        currEmp = bank.c3;
                    else if(currentEmployee.equalsIgnoreCase("C4"))
                        currEmp = bank.c4;
                    else if(currentEmployee.equalsIgnoreCase("C5"))
                        currEmp = bank.c5;
                    break;
                }
            }
           if(isDone==0){
               for(int i=0;i<acList.size();i++){
                   if(action[1].equalsIgnoreCase(acList.get(i).getName())){
                       isDone=1;
                       isAcActive=1;
                       currectAc=i;

                       System.out.println("Welcome back, " + acList.get(i).getName());
                       break;
                   }
               }
           }
           if(isDone==0){
               System.out.println("Account or employee doesn't exist!");
           }
        }

        else if(action[0].equalsIgnoreCase("approve")&& isBankActive==1 && isAcActive==0){
            currEmp.approveLoan();
        }

        else if(action[0].equalsIgnoreCase("change")&& isBankActive==1 && isAcActive==0){
            double interest = 0;
            String acType = null;
            if(action[1].equalsIgnoreCase("fixed")){
                acType = "fixedDeposit";
                interest = Double.parseDouble(action[3]);
            }
            else{
                interest = Double.parseDouble(action[2]);

                if(action[1].equalsIgnoreCase("student"))
                    acType="Student";
                else if(action[1].equalsIgnoreCase("Savings"))
                    acType="Savings";

            }
            currEmp.changeRate(interest,acType);
        }
        else if(action[0].equalsIgnoreCase("lookup")&& isBankActive==1 && isAcActive==0){
            currEmp.lookUp(action[1]);
        }
        else if(action[0].equalsIgnoreCase("see")&& isBankActive==1 && isAcActive==0){
            currEmp.see();
        }
        else if(action[0].equalsIgnoreCase("INC")){
            for(int i=0;i<acList.size();i++){
                Accounts ac = acList.get(i);
                double acTotal = 0;

                if(!ac.getAcType().equalsIgnoreCase("loan")){
                    ac.depositInterest();
                    ac.serviceCharge();

                }
                if(ac.getAcType().equalsIgnoreCase("fixeddeposit")){
                    ac.setTimePeriod(ac.getTimePeriod()+1);
                }
            }
            bank.setClock(bank.getClock()+1);
            System.out.println(bank.getClock() + " year passed");

        }



    }

}
