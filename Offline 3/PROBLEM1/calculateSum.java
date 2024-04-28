package PROBLEM1;/*adaptee class*/

import java.io.FileReader;
import java.io.IOException;

public class calculateSum{
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String inputFile) throws IOException {
        FileReader fr = new FileReader(inputFile);
        String str = "";
        int i;
        while ((i = fr.read()) != -1) {
            str += (char)i;
        }
        this.str = str;
    }

    public double getSum() {
        String[] values = (str.split(" "));
        int[] intVal = new int[values.length];
        double sum=0;
        for(int i=0;i<values.length;i++){
            intVal[i]=Integer.parseInt(values[i]);
            sum += intVal[i];
        }

        return sum;


    }
}
