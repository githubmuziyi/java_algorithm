package chapter02;

/**
 * 希尔排序
 * @author muzi
 */
public class Shell {

    public static void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        while (h < N/3) {
            // 1, 4, 13, 40, 121...
            h = 3*h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h; j -= h) {
                    if (less(a[j], a[j - h])) {
                        exch(a, j,j - h);
                    }
                }
            }
            h = h/3;
        }
    }

    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
