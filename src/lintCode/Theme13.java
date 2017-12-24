package lintCode;

/**
 * 字符串查找
 * 对于一个给定的 source 字符串和一个 target 字符串，你应该在 source 字符串中找出 target 字符串出现的第一个位置(从0开始)
 * zhangjunyang 2017/12/24 20:36
 */
public class Theme13 {

    public int strStr(String source, String target) {
        int result = -1;
        if (null == source || target == null)
            return result;
        char[] srcArr = source.toCharArray();
        char[] dstArr = target.toCharArray();
        int i = 0, j = 0;
        while (i < source.length() && j < target.length()) {
            if (srcArr[i] == dstArr[j]) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        if (j == target.length())
            result = i - j;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Theme13().strStr("source", "target"));
        System.out.println(new Theme13().strStr("abcdabcdefg", "bcd"));
    }
}
