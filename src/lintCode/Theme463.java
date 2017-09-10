package lintCode;

import java.util.Arrays;

/**
 * 整数排序
 * @author zhangjunyang 2017年8月13日 下午2:25:06
 */
public class Theme463 {

	/**
	 * 冒泡
	 * @param A
	 */
	public void sortIntegersOfBubbleSort(int[] A) {
		int n = A.length;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n - i; j++) {
				if (A[j-1] > A[j]) {
					int temp = A[j];
					A[j] = A[j-1];
					A[j-1] = temp;
				}
			}
		}
	}
	
	/**
	 * 快排
	 * @param A
	 * @param _left
	 * @param _right
	 */
	public void sortIntegersOfQuickSort(int[] A, int _left, int _right) {
		int left = _left;
		int right = _right;
		int temp = 0;
		// 排序元素至少有两个
		if (left < right) {
			temp = A[left];
			while (left != right) {
				while (right > left && A[right] > temp) {
					 right--;
				}
				A[left] = right;
				while (left < right && A[left] < temp) {
					left++;
				}
				A[right] = A[left];
			}
			A[left] = temp;
			sortIntegersOfQuickSort(A, _left, left-1);
			sortIntegersOfQuickSort(A, right+1, _right);
		}
	}
	
	/**
	 * 选择排序
	 * @param A
	 */
	public void sortIntegersOfSelectSort(int[] A) {
		int n = A.length;
		for (int i = 0; i < n; i++) {
			int k = i;// 记录最小值的位置
			for (int j = i+1; j < n; j++) {
				if (A[k] > A[j]) {
					k = j;
				}
			}
			if (k != i) {
				int temp = A[k];
				A[k] = A[i];
				A[i] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] A = {4, 1, 3, 2, 5, 10, 7, 9, 6, 8};
		Theme463 theme = new Theme463();
//		theme.sortIntegersOfBubbleSort(A);
//		theme.sortIntegersOfQuickSort(A, 0, A.length - 1);
		theme.sortIntegersOfSelectSort(A);
		System.out.println(Arrays.toString(A));
	}
}
