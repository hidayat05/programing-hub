package All;

import java.util.Scanner;

/**
 * Created by ptinkosinarmedia on 12/13/16.
 */
public class CalculateMean {
    public static void main(String[] args) {
        int sum = 0, inputNum;
        int counter;
        float mean;
        Scanner NumberScanner = new Scanner(System.in);

        System.out.println("Enter the total Number of terms whose mean");

        counter = NumberScanner.nextInt();
        System.out.println("Please enter = " + counter + " numbers");

        for (int i = 0; i < counter; i++) {
            inputNum = NumberScanner.nextInt();
            sum = sum + inputNum;
            System.out.println();
        }

        mean = sum / counter;
        System.out.println("The mean of the " + counter + " numbers you entered is " + mean);
    }
}
