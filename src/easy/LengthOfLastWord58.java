package easy;


/**
 * @author bx
 * @date 2020/6/11 下午 1:54
 */
public class LengthOfLastWord58 {
    public static int lengthOfLastWord(String s) {
        int count = 0;
        int index = s.length() - 1;
        //过滤空格
        while (true) {
            if (index < 0 || s.charAt(index) != ' ') break;
            index--;
        }
        //计算最后一个单词的长度
        for (int i = index; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("hi hi 123456789 "));
    }
}
