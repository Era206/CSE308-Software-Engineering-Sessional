package PROBLEM2;

import java.util.Scanner;

public class problem2main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String str = s.nextLine();
        String[] fileType = str.split("\\.");

        Editor editor = new Editor(fileType[1]);
    }
}
