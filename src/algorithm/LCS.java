package algorithm;

import java.util.Random;

/**
 * 最长子串（不要求连续）
 * zhangjunyang 2018/1/19 22:57
 */
public class LCS {

    public void lcs(String s1, String s2) {
        int strLen1 = s1.length();
        int strLen2 = s2.length();

        int[][] opt = new int[strLen1 + 1][strLen2 + 1];// 记录所有子问题的数组
        for (int i = strLen1 - 1; i >= 0; i--) {
            for (int j = strLen2 - 1; j >= 0; j--) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    opt[i][j] = opt[i+1][j+1] + 1;
                } else {
                    opt[i][j] = Math.max(opt[i+1][j], opt[i][j+1]);
                }
            }
        }

        int i = 0, j = 0;
        while (i < strLen1 && j < strLen2){
            if (s1.charAt(i) == s2.charAt(j)){
                System.out.print(s1.charAt(i));
                i++;
                j++;
            } else if (opt[i+1][j] >= opt[i][j+1]) {
                i++;
            } else {
                j++;
            }
        }
        System.out.println();
    }


    public String getRandomString(int length) {
        StringBuilder builder = new StringBuilder("qwertyuiopasdfghjklzxcvbnm");
        StringBuilder str = new StringBuilder();
        Random random = new Random();
        int range = builder.length();
        for (int i = 0; i < length; i++) {
            str.append(builder.charAt(random.nextInt(range)));
        }
        return str.toString();
    }

    public static void main(String[] args) {
        LCS obj = new LCS();
        String s1 = obj.getRandomString(20);
        String s2 = obj.getRandomString(20);

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        obj.lcs(s1, s2);
    }
}
