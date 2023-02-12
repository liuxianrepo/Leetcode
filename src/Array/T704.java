package Array;

// tag:数组,二分查找
public class T704 {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n;

        while (left < right) {
            int mid = (left + right) / 2;

            if (target > nums[mid]) {
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
