package All;

import java.util.Scanner;

/**
 * Created by ptinkosinarmedia on 12/13/16.
 */
public class BubleShort {
    public static void main(String[] args) {
        int n, c, d, swap;
        Scanner in = new Scanner(System.in);
        System.out.println("inout number of integers to short");
        n = in.nextInt();

        int array[] = new int[n];

        System.out.println("enter " + n + " integers");
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }

        System.out.println("Sorted list of number");

        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}
