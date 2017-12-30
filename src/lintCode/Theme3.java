package lintCode;

/**
 * 计算数字k在0到n中的出现的次数，k可能是0~9的一个值
 * zhangjunyang 2017/12/30 21:55
 */
public class Theme3 {

    public int digitCounts(int k, int n) {
        if (k < 0 || k > 9)
            return 0;
        int count = 0;
        for (int i = 0; i <= n; i++) {
            int num = i;
            while (true) {
                if (num % 10 == k) {
                    count++;
                }
                num /= 10;
                if (num == 0) break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Theme3().digitCounts(0, 19));
    }
}
