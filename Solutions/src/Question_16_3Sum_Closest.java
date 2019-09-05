import java.util.Arrays;

public class Question_16_3Sum_Closest {

    public int threeSumClosest(int[] nums, int target) {
        int result;

        Arrays.sort(nums);
        int i = 0, j = nums.length-1 , k = 1;
        int num01, num02, num03;
        int sqValue = (nums[0] + nums[1] + nums[2] - target) * (nums[0] + nums[1] + nums[2] - target) , tempSqValue, tempSum;
        result = nums[0] + nums[1] + nums[2];

        boolean isNewSqValueFound;

        while(i < (nums.length - 2)){
            // System.out.println(" i: " + i);
            num01 = nums[i];
            j =  nums.length-1;


            while(i < j){
                k = i + 1;
                isNewSqValueFound = false;

                while( k < j){
                    tempSum = nums[i] + nums[j] + nums[k] - target;
                    tempSqValue =tempSum * tempSum;

                    //   System.out.println("nums[i]: " + nums[i] + " nums[j]: " + nums[j] + " nums[k]: " + nums[k] + " tempSum: " + tempSum + " i: " + i + " j:" + j + " k:" + k);

                    if (tempSqValue < sqValue){
                        //  System.out.println("nums[i]: " + nums[i] + " nums[j]: " + nums[j] + " nums[k]: " + nums[k]);
                        sqValue = tempSqValue;
                        isNewSqValueFound = true;
                        result = nums[i] + nums[j] + nums[k];

                    } else if (isNewSqValueFound && tempSqValue > sqValue){
                        break;
                    }






                    k++;
                }



                j--;
            }






            i++;
        }



        return result;


    }


}
