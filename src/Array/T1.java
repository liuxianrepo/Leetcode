package Array;

import java.util.HashMap;
import java.util.Map;

// tag:数组,哈希表
public class T1 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> maps = new HashMap<>();

        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (maps.get(nums[i]) != null) {
                result[0] = i;
                result[1] = maps.get(nums[i]);

                return result;
            }

            maps.put(target - nums[i], i);
        }

        return null;
    }
}
