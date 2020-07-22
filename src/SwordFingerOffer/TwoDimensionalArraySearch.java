package SwordFingerOffer;

/**
 * 剑指offer小程序 第一题
 * @author bx
 * @date 2020/7/22 下午 4:11
 */

/**
 * 二位数组的查找
 */
public class TwoDimensionalArraySearch {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        boolean b = find(1, matrix);
        System.out.println(b);
    }

    public static boolean find(int target, int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int rows = matrix.length, cols = matrix[0].length;
        int r = 0, c = cols - 1;//从右上角开始
        while (r <= rows - 1 && c >= 0) {
            if (target == matrix[r][c]) return true;
            else if (target > matrix[r][c]) r++;
            else c--;
        }
        return false;
    }
}
