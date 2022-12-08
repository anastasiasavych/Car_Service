package com.company;
import java.util.Scanner;

public class Scan {

    public Scanner in;

    // прочитати ціле число, введене з клавіатури
    public int scanInt(){
        int value;
        in = new Scanner(System.in);
        while(!in.hasNextInt()){
            in.next();
            System.out.print("Retry: ");
        }value = in.nextInt();
        return value;
    }


    // прочитати  строки з клавіатури
    public String scanString() {
        in = new Scanner(System.in);
        String line;
        line = in.nextLine();
        return line;
    }
}
