package lintCode;

/**
 * 设计一个算法，计算出n阶乘中尾部零的个数
 * zhangjunyang 2017/12/29 22:07
 */
public class Theme2 {
    public long trailingZeros(long n) {
        long result = 0;
        // 尾部0的数量和2*5这个因子有关
        while (n != 0) {
            n /= 5;
            result += n;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Theme2().trailingZeros(5555550000000L));
    }
}
