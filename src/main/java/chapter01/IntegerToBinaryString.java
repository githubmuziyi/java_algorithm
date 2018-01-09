package chapter01;

/**
 * 将一个整形转换为二进制字符串
 * @author muzi
 */
public class IntegerToBinaryString {

    public static void main(String[] args) {
        System.out.println(toBinaryStringForUser(11));
    }

    /**
     * Integer自带静态方法
     * @param N
     * @return
     */
    public static String toBinaryString(int N) {
        return Integer.toBinaryString(N);
    }

    /**
     * 自己实现转换
     * @param N
     * @return
     */
    public static String toBinaryStringForUser(int N) {
        String s = "";
        for (int n = N; n > 0; n /= 2) {
            s = (n % 2) + s;
        }
        return s;
    }
}
