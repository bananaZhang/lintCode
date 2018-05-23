package lintCode;

/**
 * 丑数：设计一个算法，找出只含素因子2，3，5 的第 n 小的数。
 * zhangjunyang 2017/12/30 21:55
 */
public class Theme4 {

    public static void main(String[] args) {
        System.out.println(new Theme4().nthUglyNumber(100));
    }

    public int nthUglyNumber(int n) {
        int uglyNum[] = new int[n];// 丑数组
        uglyNum[0] = 1;
        // 相当于3个指针，每次新的丑数是某个指针指向数的乘积后，指针后移一位，因为再下次的丑数肯定比这次的丑数大
        int f2 = 0, f3 = 0, f5 = 0;
        // 丑数列表中的下一个数字，一定是之前某一个数字乘以2、或乘以3、或乘以5
        for (int i = 1; i < n; i++) {
            uglyNum[i] = getMin(uglyNum[f2] * 2, uglyNum[f3] * 3, uglyNum[f5] * 5);
            if (uglyNum[i] == uglyNum[f2] * 2)
                f2++;
            if (uglyNum[i] == uglyNum[f3] * 3)
                f3++;
            if (uglyNum[i] == uglyNum[f5] * 5)
                f5++;
        }
        return uglyNum[n-1];
    }

    private int getMin(int t1, int t2, int t3) {
        int temp = t1 < t2 ? t1 : t2;
        return temp < t3 ? temp : t3;
    }

}
