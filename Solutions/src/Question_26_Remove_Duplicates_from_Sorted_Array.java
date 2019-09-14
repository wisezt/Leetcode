class Solution {
    public int removeDuplicates(int[] nums) {
        
        int result = 0;
        
        if (nums.length != 0){
            result = nums[0];
        }
        
        
        int j = 0;
        
        for (int i = 1 ; i < nums.length ; i++){
            
          
               
            if ( nums[ i ] != nums[j] ){
                j++;
               nums[j] = nums[i];
               
           
               
                
                  
               
           
                        
                    
           }
            
                

                    
        }
        
        
        // j is the index, and we need return the length, so + 1
        return j + 1;
        
    }
}