package chapter02;

/**
 * 插入排序
 * @author muzi
 *
 * 命题 B。对于随机排列的长度为 N 且主键不重复的数组，平均情况下插入排序需要~ N2/4 次比 较以及~ N2/4 次交换。
 * 最坏情况下需要~ N2/2 次比较和~ N2/2 次交换，最好情况下需要 N-1 次比较和 0 次交换。
    证明。和命题 A 一样，通过一个 N×N 的轨迹表可以很容易就得到交换和比较的次数。
    最坏情 况下对角线之下所有的元素都需要移动位置，最好情况下都不需要。对于随机排列的数组，
    在 平均情况下每个元素都可能向后移动半个数组的长度，因此交换总数是对角线之下的元素总数 的二分之一。
    比较的总次数是交换的次数加上一个额外的项，该项为 N 减去被插入的元素正好是已知的最小 元素的次数。
    在最坏情况下(逆序数组)，这一项相对于总数可以忽略不计;在最好情况下(数 组已经有序)，这一项等于 N-1。
 */
public class Insertion {

    public static void sort(Comparable[] a) {;
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0; j--) {
                if (less(a[j], a[j - 1])) {
                    exch(a, j, j - 1);
                }
            }
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
