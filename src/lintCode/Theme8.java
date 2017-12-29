package lintCode;

/**
 * 给定一个字符串和一个偏移量，根据偏移量旋转字符串(从左向右旋转)
 * zhangjunyang 2017/12/29 21:36
 */
public class Theme8 {

    public void rotateString(char[] str, int offset) {
        int len = str.length;
        if (len == 0)
            return;
        offset %= len;// 优化多余计算
        for (int i = 0; i < offset; i++) {
            char c = str[0];
            str[0] = str[len - 1];
            for (int j = len - 1; j > 0; j--) {
                str[j] = str[j-1];
            }
            str[1] = c;
        }
    }

    public static void main(String[] args) {
        char[] str = "timelimiterror".toCharArray();
        new Theme8().rotateString(str, 1000000000);
        System.out.println(str);
    }
}
