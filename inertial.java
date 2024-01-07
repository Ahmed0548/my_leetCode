class Solution {
static int isInertial(int[] arr) {
       if(arr == null || arr.length == 0) {
           return 0;
       }
       int max = arr[0];
       boolean maxIsEven = false;
       for(int x: arr) {
           if(x > max) {
               max = x;
               maxIsEven = (x % 2 == 0);
           }
       }
       if(!maxIsEven) {
            return 0;
        }
        boolean hasOdd = false;
        for(int x: arr) {
            if(x % 2 != 0) {
                hasOdd = true;
                break;
            }
        }
        if(!hasOdd) {
            return 0;
        }
        for(int x: arr) {
            if(x % 2 != 0) {
                for(int y: arr) {
                    if(y % 2 == 0 && y != max && x <= y) {
                        return 0;
                    }
                }
            }
        }
        return 1;
    }
} 
