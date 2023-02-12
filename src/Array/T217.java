package Array;

import java.util.HashMap;
import java.util.Map;

// tag:数组,哈希表
public class T217 {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null) {
                return true;
            }

            map.put(nums[i], i);
        }

        return false;
    }
}
