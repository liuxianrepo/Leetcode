package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// tag:数组,双指针,排序
public class T15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        List<List<Integer>> ans = new ArrayList<>();

        for (int first = 0; first < n; first++) {
            if (first > 0 && nums[first - 1] == nums[first]) {
                continue;
            }

            int target = -nums[first];
            int third = n-1;
            for (int second = first + 1; second < n; second++) {
                if (second > first + 1 && nums[second] == nums[second - 1]) {
                    continue;
                }

                while (second < third && nums[second] + nums[third] > target) {
                    third--;
                }

                if (second == third) {
                    break;
                }

                if (nums[second] + nums[third] == target) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[third]);
                    ans.add(list);
                }
            }
        }

        return ans;
    }
}
