package All;

/**
 * Created by hidayat on 12/12/16.
 */
public class ArrayOperations {
    public static void main(String[] args) {
        double[] myList = {1.9, 2.9, 3.4, 3.5};
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i]);
        }

        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }

        System.out.println("Total is " + total);

        // finding the largers element
        double max = myList[0];
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] > max)
                max = myList[i];
        }

        System.out.println("max is = " + max);
    }
}
