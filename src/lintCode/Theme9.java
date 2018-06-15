package lintCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个整数n. 从 1 到 n 按照下面的规则打印每个数：

     如果这个数被3整除，打印fizz.
     如果这个数被5整除，打印buzz.
     如果这个数能同时被3和5整除，打印fizz buzz.
 */
public class Theme9 {
    public static void main(String[] args) {
        new Theme9().fizzBuzz(15).forEach(System.out::println);
    }

    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>(n);
        for (int i = 1; i <= n; i ++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("fizz buzz");
            } else if (i % 3 == 0) {
                list.add("fizz");
            } else if (i % 5 == 0) {
                list.add("buzz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}
