package search;

/**
 * 二分查找
 * zhangjunyang 2018/2/15 14:25
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 6, 7, 10, 12, 13, 16, 28};
        System.out.println(search(arr, 10));
    }

    public static int search(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);// 移位运算优先级低
            if (arr[mid] > target) {
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
