package lintCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author ZJY
 * 实现一个带有取最小值min方法的栈，min方法将返回当前栈中的最小值。
 * 你实现的栈将支持push，pop 和 min 操作，所有操作要求都在O(1)时间内完成。
 * @date 2018/6/22 16:00
 */
public class Theme12{

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public Theme12() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    /*
     * @param number: An integer
     * @return: nothing
     */
    public void push(int number) {
        stack.push(number);
        if (minStack.isEmpty() || minStack.peek() >= number) {
            minStack.push(number);
        }
    }

    /*
     * @return: An integer
     */
    public int pop() {
        int number = stack.pop();
        if (number == minStack.peek()) {
            minStack.pop();
        }
        return number;
    }

    /*
     * @return: An integer
     */
    public int min() {
        if (!stack.empty()) {
            return minStack.peek();
        }
        return 0;
    }

}
