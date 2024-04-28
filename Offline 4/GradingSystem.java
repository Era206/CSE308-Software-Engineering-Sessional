import java.lang.Math;

public class GradingSystem {
    public char gradeForThreeCredit(String str) {
        int minus =0;
        int decimal =0;
       // String str = "abc";
        for(int i=0; i < str.length(); i++) {
            Boolean flag = Character.isDigit(str.charAt(i));
            if((str.charAt(i)!='.' && str.charAt(i)!='-') && flag==false) {
               throw new NumberFormatException("not a number format!");
            }
            if(str.charAt(i)=='.'){
                decimal++;
                if(decimal>1){
                    throw new NumberFormatException("There can't be greater than one decimal in a number!");
                }
            }
            if(str.charAt(i)=='-'){
                minus++;
                if(minus>1){
                    throw new NumberFormatException("There can't be greater than one minus character in a number!");
                }
            }

        }
        double d = Double.parseDouble(str);
        if(d<0 ) {
            throw new IllegalArgumentException("Number for grade cannot be negative!");
        }
        d = Math.ceil(d);
        if(d>=0.0 && d<180.0){
            return 'F';
        }
        else if(d>=180.0 && d<210.0){
            return 'C';
        }
        else if(d>=210.0 && d<240.0){
            return 'B';
        }
        else if(d>=240.0 && d<=300){
            return 'A';
        }
        else
        {
            throw new NullPointerException("value not in correct range(in between 0-300)");
        }
    }

    public char gradeForFourCredit(String str) {
        int minus =0;
        int decimal =0;
        // String str = "abc";
        for(int i=0; i < str.length(); i++) {
            Boolean flag = Character.isDigit(str.charAt(i));
            if((str.charAt(i)!='.' && str.charAt(i)!='-') && flag==false) {
                throw new NumberFormatException("not a number format!");
            }
            if(str.charAt(i)=='.'){
                decimal++;
                if(decimal>1){
                    throw new NumberFormatException("There can't be greater than one decimal in a number!");
                }
            }
            if(str.charAt(i)=='-'){
                minus++;
                if(minus>1){
                    throw new NumberFormatException("There can't be greater than one minus character in a number!");
                }
            }

        }
        double d = Double.parseDouble(str);
        if(d<0 ) {
            throw new IllegalArgumentException("Number for grade cannot be negative!");
        }
        d = Math.ceil(d);
        if(d>=0.0 && d<240.0){
            return 'F';
        }
        else if(d>=240.0 && d<280.0){
            return 'C';
        }
        else if(d>=280.0 && d<320.0){
            return 'B';
        }
        else if(d>=320.0 && d<=400.0){
            return 'A';
        }
        else
        {
            throw new NullPointerException("value not in correct range(in between 0-400)");
        }
    }

}
