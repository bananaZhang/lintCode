package algorithm;

import java.util.Arrays;

public class Kmp {


    /**
     * j = next[i]
     * 当str[j] == str[i]时，有next[i+1] == next[i] + 1
     */
    public static void callNext(char[] str, int[] next) {
        int len = str.length;
        int i = 0, j = -1;
        next[0] = -1;
        while (i < len - 1) {
            if (j == -1 || str[i] == str[j]) {
                i++;
                j++;
                next[i] = j;
            } else {
                // 不相等则代表不可能找到str[0 ~ j] == str[i-j+1 ~ i]这样相同的子串了
                // 退回到next[j]则有可能str[j] == str[i]
                j = next[j];
            }
        }
    }

    public static int KMP(char[] src, char[] pat) {
        int i = 0, j = 0;
        int[] next = new int[pat.length];
        callNext(pat, next);
        while (i < src.length && j < pat.length) {
            if (j == -1 || src[i] == pat[j]) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        if (j == pat.length) {
            return i - j;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        String subStr = "abcabx";// next: -1 0 0 0 1 2
        char str[] = subStr.toCharArray();
        int next[] = new int[str.length];
        callNext(str, next);
        System.out.println(Arrays.toString(next));
    }
}
