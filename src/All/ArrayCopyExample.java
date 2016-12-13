package All;

/**
 * Created by hidayat on 12/12/16.
 */
class ArrayCopyExample {
    public static void main(String[] args) {
        char[] copyfrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
        char[] copyTo = new char[7];
        System.arraycopy(copyfrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));
    }
}


class ArrayCopyOfRangeExample {
    public static void main(String[] args) {
        char[] copyfrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
        char[] copyTo = java.util.Arrays.copyOfRange(copyfrom, 2, 9);
        System.out.println(new String(copyTo));
    }
}