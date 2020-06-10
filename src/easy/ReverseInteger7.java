package easy;

/**
 * @author bx
 * @date 2020/6/10 下午 5:01
 */
public class ReverseInteger7 {

    /**
     * 存在内存内存溢出问题
     */
    public static int reverse1(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public static int reverse(int x) {
        long rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            rev = rev * 10 + pop;
        }
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) return 0;
        return (int) rev;
    }


    public static void main(String[] args) {
//        int reverse = reverse1(998877);
        int reverse = reverse(1534236469);
        System.out.println(reverse);
    }
}
