import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum04 {
    public static void main(String[] args) {

        int[] nums = { 3, 2, 4 };
        int target = 6;

        for (int i : twoSum(nums, target)) {
            System.out.println(i);
        }

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])){
                result[0] = hashMap.get(target - nums[i]);
                result[1] = i;
                return result;
            }
           

            hashMap.put(nums[i], i);

        }

        return result;
    }

}
