class Solution {
    public int reverse(int x) {
        
     
           
        if (x > (int) Math.pow(2, 31) -1 || x < -Math.pow(2, 31)){
            return 0;
        }
           
     
        int theX = Math.abs(x);
        int result = 0;
        int reminder = 0;
        boolean negative = false;
        
        if ( x < 0) negative =true;
        
        if (x == 0) return 0;
        
        
        
        while (theX > 0 ){
            reminder = theX % 10;
            
            if ( result > 214748364){
                return 0;
            }
            
            result = result*10 + reminder;
            theX = (theX - reminder) / 10;
            
        }
        
           
        if (result > (int) Math.pow(2, 31) -1 || result < -Math.pow(2, 31)){
            return 0;
        }
        
        
        if(negative){
            result = - result;
        }
        
        return result;
        
    }
}