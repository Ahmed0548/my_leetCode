class Solution {
    public int mySqrt(int x) {
        
        long number = x;
        while(number * number > x) {
            number = (number + x/number)/2;
            
        }
        return (int)number;
    }
   
}

#########################################################################

class Solution {
    public int mySqrt(int x) {
    for(int i = x-1; i > 0; i--) {
                if(i * i <= x) {
                    return i;
                }
            }
            return -1;
    }
}
