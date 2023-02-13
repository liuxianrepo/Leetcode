package Array;

import java.util.Deque;
import java.util.LinkedList;

// tag:数组,动态规划,单调栈,双指针
public class T42 {

    // 单调栈
    public int trap2(int[] height) {
        int ans = 0;
        Deque<Integer> stack = new LinkedList<>();

        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int top = stack.pop();
                if (stack.isEmpty()) {
                    break;
                }

                int left = stack.peek();
                int currentWidth = i - left - 1;
                int currentHeight = Math.min(height[left], height[i]) - height[top];
                ans += currentWidth * currentHeight;
            }

            stack.push(i);
        }

        return ans;
    }

    // 动态规划
    public int trap1(int[] height) {
        int n = height.length;
        if (n == 0) {
            return 0;
        }

        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        int[] rightMax = new int[n];
        rightMax[n-1] = height[n-1];
        for (int i = n-2; i >=0 ; i--) {
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }

        int result = 0;
        for (int i = 1; i < n-1; i++) {
            result += Math.min(leftMax[i-1], rightMax[i-1]) - height[i];
        }

        return result;
    }
}
