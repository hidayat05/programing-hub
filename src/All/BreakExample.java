package All;

/**
 * Created by ptinkosinarmedia on 12/13/16.
 */
public class BreakExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int x : numbers
                ) {
            if (x == 30) {
                break;
            }
            System.out.println(x);
            System.out.println("\n");
        }
    }
}
