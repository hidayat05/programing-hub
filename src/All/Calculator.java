package All;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by ptinkosinarmedia on 12/13/16.
 */
public class Calculator {
    public static void main(String[] args) {
        int choice;
        int y = 0;
        int x = 0;
        int sum;

        PrintStream out;
        Scanner input;


        Calculator calculator = new Calculator();
        try{
            out = new PrintStream("calculate.txt");

        } catch (Exception e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
