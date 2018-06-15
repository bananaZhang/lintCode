package lintCode;

import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * Given a binary search tree and a range [k1, k2], return all elements in the given range.
 */
public class Theme11 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        Collections.sort(list);
        list.forEach(System.out::println);
    }

    public List<Integer> searchRange(TreeNode root, int k1, int k2) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (null != node || stack.size() > 0) {
            while (node != null) {
                stack.push(node);
                if (node.val >= k1 && node.val <= k2) {
                    result.add(node.val);
                }
                node = node.left;
            }
            if (stack.size() > 0) {
                node = stack.pop().right;
            }
        }
        Collections.sort(result);
        return result;
    }

    class TreeNode {
        public int val;
        public TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

}
