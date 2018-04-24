package lintCode;

/**
 * 合并两个排序的整数数组A和B变成一个新的数组
 * zhangjunyang 2018/1/7 18:56
 */
public class Theme6 {
    public int[] mergeSortedArray(int[] A, int[] B) {
        int lenA = A.length;
        int lenB = B.length;
        int[] result = new int[lenA + lenB];
        int i = 0, j = 0, k = 0;
        while (i != lenA && j != lenB) {
            result[k++] = A[i] < B[j] ? A[i++] : B[j++];
        }
        if (i != lenA) {
            while (i < lenA) {
                result[k++] = A[i++];
            }
        }

        if (j != lenB) {
            while (j < lenB) {
                result[k++] = B[j++];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] result = new Theme6().mergeSortedArray(new int[]{1,2,3,4}, new int[]{2,4,5,6});
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
