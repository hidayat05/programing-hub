package All;

import java.util.Random;

/**
 * Created by ptinkosinarmedia on 12/13/16.
 */
public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 200; i++) {
            System.out.println(getRandomNumberRange(10000, 99999));
        }
    }

    private static int getRandomNumberRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max mus be greather than min");
        }

        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}
