package Array;

// tag:数组,双指针
public class T26 {
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return 1;
        }

        int fast = 1, slow = 1;
        while (fast < n) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }

        return slow;
    }
}
