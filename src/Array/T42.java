package Array;

// tag:数组,动态规划,单调栈,双指针
public class T42 {
    public int trap(int[] height) {
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
