package chapter02;

/**
 * 选择排序
 * @author muzi
 *
 * 命题 A。对于长度为 N 的数组，选择排序需要大约 N2/2 次比较和 N 次交换。
    证明。可以通过算法的排序轨迹来证明这一点。我们用一张 N×N 的表格来表示排序的轨迹，
    其中每个非灰色字符都表示一次比较。表格中大约一半的元素不是灰
    色的——即对角线和其上部分的元素。对角线上的每个元素都对应着一次交换。通过查看代码 我们可以更精确地得到，
    0 到 N-1 的任意 i 都会进行一次交换和 N-1-i 次比较，因此总共有 N 次交换以及
    (N-1)+(N-2)+...+2+1=N(N-1)/2 ~ N2/2 次比较。
 */
public class Selection {

    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[i])) {
                    min = j;
                }
            }
            exch(a, i, min);
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
