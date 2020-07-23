package SwordFingerOffer;

import java.util.BitSet;

/**
 * 剑指offer小程序 第49题
 *
 * @author bx
 * @date 2020/7/23 上午 11:07
 */
public class TheFirstCharacterPositionThatAppearsOnlyOnce {

    public static void main(String[] args) {
        String string = "abcdefgba";
        System.out.println(FirstNotRepeatingChar2(string));
    }

    public static int FirstNotRepeatingChar(String str) {
        int[] cnts = new int[256];
        for (int i = 0; i < str.length(); i++) {
            cnts[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (cnts[str.charAt(i)] == 1) return i;
        }
        return -1;
    }

    public static int FirstNotRepeatingChar2(String str) {

        BitSet bs1 = new BitSet(256);
        BitSet bs2 = new BitSet(256);

        for (char c : str.toCharArray()) {
            if (!bs1.get(c) && !bs2.get(c)) bs1.set(c);
            else if (bs1.get(c) && !bs2.get(c)) bs2.set(c);
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (bs1.get(c) && !bs2.get(c)) return i;
        }
        return -1;
    }

}
