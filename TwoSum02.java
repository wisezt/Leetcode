import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum02 {
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

            if (hashMap.containsValue(target - nums[i]) ){
                // System.out.println(nums[i]);
                result[0]  = i;
                for (Map.Entry<Integer, Integer> e : hashMap.entrySet()) {
                    if (e.getValue() == (target - nums[i])){
                        result[1] = e.getKey();
                    }
                }
                break;
            }

           hashMap.put(i, nums[i]);

        }
        




        return result;
    }

}
