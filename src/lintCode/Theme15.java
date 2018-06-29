package lintCode;

import java.util.*;

/**
 * 给定一个数字列表，返回其所有可能的排列。使用递归和非递归分别解决。
 * @author ZJY
 * @ClassName: Theme15
 * @Description: Theme15
 * @date 2018/6/29 14:47
 */
public class Theme15 {

    public static void main(String[] args) {
        Theme15 t = new Theme15();
        int[] nums = new int[]{1, 2, 3};
        List<List<Integer>> resList = t.permute(nums);
        resList.forEach(System.out::println);
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        if (0 == nums.length) {
            resultList.add(new ArrayList<>());
        } else {
            resultList.add(new ArrayList<>(Arrays.asList(nums[0])));
        }
        for (int i = 1; i < nums.length; i++) {
            int size = resultList.size();
            for (int j = 0; j < size; j++) {
                List<Integer> integerList = resultList.get(0);
                for (int k = 0; k <= integerList.size(); k++) {
                    List<Integer> newList = new ArrayList<>(integerList);

                    newList.add(k, nums[i]);

                    resultList.add(newList);
                }
                resultList.remove(0);
            }
        }
        return resultList;
    }
}
