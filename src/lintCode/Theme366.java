package lintCode;

public class Theme366 {
	
	public int fibonacci(int n) {
        int[] a = new int[n+2];// 大小为n+2防止n为0和1的时候溢出
        a[1] = 0;
        a[2] = 1;
        int i = 3;
        while (i <= n) {
            a[i] = a[i-1] + a[i-2];
            i++;
        }
        return a[n];
    }
	
	// 递归求法
	public int fibonacci2(int n) {
		if (n == 1 || n == 2) {
			return (n-1);
		}
		return fibonacci2(n-1) + fibonacci2(n-2);
	}

	public static void main(String[] args) {
		System.out.println(new Theme366().fibonacci(3));
	}
}
