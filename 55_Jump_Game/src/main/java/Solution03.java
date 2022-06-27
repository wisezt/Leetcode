import java.util.HashSet;
import java.util.Set;

public class Solution03 implements Solution {

    public boolean canJump(int[] nums) {


        return canJumpNext(nums);
    }

    private boolean canJumpNext(int[] nums) {
            int maxIndex = nums[0];
            int numsLength= nums.length;
            int endIndex = numsLength -1;
            int tmpIndex;

            for (int i = 0; i <= maxIndex; i++){

//                System.out.printf("i: %s\tmaxIndex: %s\t\n",i,maxIndex);
                tmpIndex = i + nums[i];

                if ( tmpIndex >= endIndex ){
                    return true;
                }

                if (tmpIndex > maxIndex){
                    maxIndex = tmpIndex;
                }



            }




        return false;
    }
}
