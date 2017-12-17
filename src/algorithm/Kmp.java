package algorithm;

import java.util.Arrays;

public class Kmp {

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
                j--;
            }
        }
    }

    public static void main(String[] args) {
        String subStr = "abcabx";// next: 0 1 1 1 2 3
        char str[] = subStr.toCharArray();
        int next[] = new int[str.length];
        callNext(str, next);
        System.out.println(Arrays.toString(next));
    }
}
