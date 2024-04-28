public class MD extends Officer{


    @Override
    public void see() {
        System.out.println("Internal Fund " + Bank.getInternalFund());
    }

    @Override
    public void changeRate(Double interest,String acType){
        if(acType.equalsIgnoreCase("Student"))
            Student.setInterestRate(interest);
        else if(acType.equalsIgnoreCase("Savings"))
            Savings.setInterestRate(interest);
        else if(acType.equalsIgnoreCase("FixedDeposit"))
            FixedDeposit.setInterestRate(interest);

        System.out.println("interest rate is updated");
    }

}
