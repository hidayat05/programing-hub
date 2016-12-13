package All;

import java.util.Scanner;

/**
 * Created by ptinkosinarmedia on 12/13/16.
 */
public class ReverseString {
    public static void main(String[] args) {
        String original, reverse = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String to reverse ");
        original = scanner.nextLine();

        int lenght = original.length();
        for (int i = lenght - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }

        System.out.println("reverse string result = " + reverse);
    }
}
