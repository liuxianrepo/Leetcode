package Array;

// tag:数组,双指针
public class T11 {
    public int maxArea(int[] height) {
        int length = height.length;
        int left = 0;
        int right = length - 1;
        int ans = Integer.MIN_VALUE;

        while (left < right) {
            int temp = Math.min(height[left], height[right]) * (right - left);
            if (temp > ans) {
                ans = temp;
            }

            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }

        return ans;
    }
}
