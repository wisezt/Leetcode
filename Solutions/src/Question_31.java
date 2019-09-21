class Solution {
    public void nextPermutation(int[] nums) {
        
        if (nums.length < 2) return ;
        
        int i = nums.length - 2;
        
        while (i >= 0 && nums[i] >= nums[i + 1]){
            i--;
        }
        
      int j = i;
        
    if (i >= 0){
        
       
        do{
            j++;
        }  while ( j < nums.length - 1 && nums[j + 1] > nums[i]);
        //    System.out.println("i: " + i + " j: " + j);
                int theNum = nums[i];
     //   System.out.println("j: " + j);
         
     //   System.out.println("nums[i]: " + nums[i] + "nums[j]" + nums[j] );
        
        nums[i] = nums[j];
        nums[j] = theNum;
        
        
    }
        
   
          

        
        reverse(nums, i);
        
    }
    
    public static void reverse(int[] nums, int startIndex){
        int i = startIndex + 1;
        int j = nums.length-1;
        int theNum;
        while( i < j){
            theNum = nums[i];
            nums[i] = nums[j];
            nums[j] = theNum;
            i++;
            j--;
            
        };
        
        
    };
    
    
    
}