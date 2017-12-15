package chapter01;

/**
 * Created by muzi on 2017/12/13.
 * 欧几里得算法
 *     目的：查找两个数的最大公约数
 *     描述：计算两个非负整数 p 和 q 的最大公约数:若 q 是 0，则最大公约数为 p。
 *         否则，将 p 除以 q得到余数r，p和q的最大公约数即为q和 r 的最大公约数
 * @author muzi
 */
public class MaximumCommonDivisor {

    public static void main(String[] args) {
        int divisor = MaximumCommonDivisor.gcd(10, 6);
        System.out.println(divisor);
    }

    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }
}
