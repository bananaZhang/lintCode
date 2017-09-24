package lintCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Theme5 {
	
	public static void main(String[] args) {
		int[] a = {9,3,2,4,8};
		System.out.println(new Theme5().kthLargestElement(3, a));
	}

	public int kthLargestElement(int k, int[] nums) {
        int len = nums.length;
        if (k > len) {
        	return 0;
        }
        Arrays.sort(nums);
        int[] maxArr = new int[len];
        Set<Integer> set = new HashSet<>();
        int j = 0;
        for (int i = 0; i < len; i++) {
        	if (!set.contains(nums[i])) {
        		maxArr[j] = nums[i];
        		j++;
        	}
        }
        return maxArr[maxArr.length - k];
    }
}
