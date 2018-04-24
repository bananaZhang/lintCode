package sort;

/**
 * 快速排序
 * zhangjunyang 2018/1/28 21:56
 */
public class QuickSort {

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int low = left;
            int high = right;
            int pivot = arr[low];// 哨兵
            while (low < high) {
                while (arr[high] > pivot && low < high)
                    high--;
                arr[low] = arr[high];
                while (arr[low] <= pivot && low < high)// 两个循环中其中一个要加上=号，否则会死循环
                    low++;
                arr[high] = arr[low];
            }
            arr[low] = pivot;

            quickSort(arr, 0, low - 1);
            quickSort(arr, low + 1, right);
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{3, 4, 1, 6, 2, 2, 7, 5};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }
}
