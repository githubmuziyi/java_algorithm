package chapter01;

/**
 * 二分查找的递归实现
 * Created by muzi on 2017/12/18.
 * @author muzi
 *
 * 编写递归代码时，最重要的有以下三点：
 *  1.递归总有一个最简单的情况——方法的第一条语句总是一条包含return的条件语句
 *  2.递归调用总是尝试去解决一个规模更小的子问题，这样递归才能收敛到最简单的情况，在本例中，第三个参数和第四个参数的差值一直在缩小
 *  3.递归调用的父问题和尝试结局的子问题之间不应该存在交集，在本例中两个子问题操作的数组部分是不同的
 */
public class BinarySearcher {

    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1);
    }

    private static int rank(int key, int[] a, int lo, int hi) {
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo)/2;
        if (key > a[mid]) {
            return rank(key, a, lo + 1, hi);
        }
        if (key < a[mid]) {
            return rank(key, a, lo, hi -1);
        }
        return mid;
    }
}
