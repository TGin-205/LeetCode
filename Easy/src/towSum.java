
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSum s = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] res = s.twoSum(nums, target);
        System.out.println(Arrays.toString(res)); // [0, 1]
    }
}
