import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum03 {
    public static void main(String[] args) {

        int[] nums = { 3, 2, 4 };
        int target = 6;

        for (int i : twoSum(nums, target)) {
            System.out.println(i);
        }

    }

    public static int[] twoSum(int[] nums, int target) {

        Arrays.sort(nums);

        int[] result = new int[2];
        int j = nums.length - 1 ;
        int sum;
        for (int i = 0; i < nums.length; i++) {
                sum = nums[i] + nums[j];
                if ( target == sum ){
                    return new int[]{i,j};
                } else if ( target > sum ){
                    continue;
                }

                while (target < sum){
                    j--;
                    sum = nums[i] + nums[j];
                    if ( target == sum ){
                        return new int[]{i,j};
                    } else if ( target > sum ){
                        break;
                    }
                }
 
   

        }

        return result;
    }

}
