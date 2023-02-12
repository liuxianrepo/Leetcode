package Array;

// tag:数组,二分查找,分治算法
public class T4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length, n = nums2.length;

        int left = 0, right = m;

        while (left <= right) {
            int i = (left + right + 1) / 2;
            int j = (m + n + 1) / 2 - i;

            if (nums1[i - 1] > nums2[j]) {
                right = i - 1;
            } else {
                left = i;
            }
        }

        int i = left;
        int j = (m + n + 1) / 2 - i;

        int numbs1LeftMax = i == 0 ? Integer.MIN_VALUE : nums1[i - 1];
        int numbs1RightMin = i == m ? Integer.MAX_VALUE : nums1[i];
        int nums2leftMax = j == 0 ? Integer.MIN_VALUE : nums2[j - 1];
        int nums2RightMin = j == n ? Integer.MAX_VALUE : nums2[j];

        if (((m + n) % 2) == 1) {
            return Math.max(numbs1LeftMax, numbs1RightMin);
        } else {
            return (double) ((Math.max(numbs1LeftMax, nums2leftMax) + Math.min(numbs1RightMin, nums2RightMin))) / 2;
        }
    }
}
