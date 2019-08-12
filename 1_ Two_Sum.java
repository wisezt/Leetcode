/*

1. Two Sum

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

*/


class 1_Two_Sum {
    
    public static void main(String[] strings){
        
        int[] array= {2, 7, 11, 15};
        twoSum(array, 9);
        
    }
    
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int sum = -1;
        
        loop01:
        for (int i = 0 ; i < nums.length; i++){
            
            for (int j = i + 1; j < nums.length ; j++){
                sum = nums[i] + nums[j];
                System.out.println(sum);
                if (target == sum){
                    result[0] = i;
                    result[1] = j;
                    break loop01;
                }else{
                    result[0] = -1;
                    result[1] = -1;
                }
                
                
            }
                

            
            
        }
        
         
        
        System.out.println(result);
        
                   return result;
        
    }
}