package Array;

// tag:数组,双指针
public class T27 {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;

        if (length == 1) {
            return 1;
        }

        int slow = 1, fast = 1;
        while (fast < length) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }

            fast++;
        }

        return slow;
    }
}
