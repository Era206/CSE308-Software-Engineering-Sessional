package PROBLEM1;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {
        ClientInterface targetInterface = new adapter();
        targetInterface.giveSumDetails();
        System.out.println(targetInterface.getSumDetails());
    }
}
