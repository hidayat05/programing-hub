package All;

import java.util.Scanner;

/**
 * Created by hidayat on 12/12/16.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] intArrays = new int[10];
        int searchValue = 0, index;

        System.out.println("Enter 10 Number");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < intArrays.length; i++) {
            intArrays[i] = in.nextInt();
        }

        System.out.println("Enter number to search : ");
        searchValue = in.nextInt();
        index = binarySearch(intArrays, searchValue);
        if (index != -1) {
            System.out.println("Found at index: " + index);
        } else {
            System.out.println("Not Found");
        }
    }

    private static int binarySearch(int[] search, int find) {
        int start, end, midPt;
        start = 0;
        end = search.length - 1;
        while (start <= end) {
            midPt = (start + end) / 2;
            if (search[midPt] == find) {
                return midPt;
            } else if (search[midPt] < find) {
                start = midPt + 1;
            } else {
                end = midPt - 1;
            }
        }
        return -1;
    }
}
