package Array;

// tag:数组
public class T1480 {
    public int[] runningSum(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        result[0] = nums[0];

        for (int i = 1; i < length; i++) {
            result[i] = result[i-1] + nums[i];
        }

        return result;
    }
}
