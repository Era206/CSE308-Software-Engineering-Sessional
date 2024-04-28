package PROBLEM1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class adapter extends calculateSum implements ClientInterface {
    @Override
    public void giveSumDetails() throws IOException {
        FileReader fr = new FileReader("input.txt");
        FileWriter fw = new FileWriter("output.txt");
        String str = "";
        int i;
        while ((i = fr.read()) != -1) {

            // Storing every character in the string
            if((char)i=='~'){
                i=32;
            }
            str += (char)i;
        }
        fw.write(str);
        fr.close();
        fw.close();

        setStr("output.txt");


    }

    @Override
    public String getSumDetails() {
        return ("Total sum: " + getSum());
    }


}
