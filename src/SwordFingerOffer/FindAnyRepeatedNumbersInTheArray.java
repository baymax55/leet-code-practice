package SwordFingerOffer;

import java.util.Arrays;
import java.util.Collections;

/**
 * 剑指offer小程序 第二题
 *
 * @author bx
 * @date 2020/7/22 下午 5:03
 */
public class FindAnyRepeatedNumbersInTheArray {
    public static void main(String[] args) {
        Integer[] array = {2, 3, 1, 0, 2, 5};
//        int n = Collections.max(Arrays.asList(array));
        int n = 6;
        int[] duplication = new int[1];
        boolean duplicate = duplicate(array, n, duplication);
        System.out.println(duplicate);
        System.out.println(Arrays.toString(duplication));

    }

    /**
     * @param nums        待查找数组
     * @param length      数组长度加一
     * @param duplication 存放重复元素
     * @return 是否存在重复元素
     */
    public static boolean duplicate(Integer[] nums, int length, int[] duplication) {
        if (nums == null || length <= 0) return false;
        for (int i = 0; i < length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    duplication[0] = nums[i];
                    return true;
                }
                swap(nums, i, nums[i]);
            }
        }
        return false;
    }

    private static void swap(Integer[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }


}
