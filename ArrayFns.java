
public class ArrayFns {
    public static int count(Comparable[] arrCompare, Comparable compare) {
        int x = 0;
        for (int i = 0; i < arrCompare.length; i++) {
            if (arrCompare[i].equals(compare)) {
                x++;
            }
        }
        return x;
    }
}
