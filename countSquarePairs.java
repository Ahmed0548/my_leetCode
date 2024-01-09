class Solution {
   static int countSquarePairs(int[] arr) {
    int count = 0;
    for(int i = 0; i < arr.length; i++) {
        for(int j = 0; j < arr.length; j++) {
            if(arr[i] <= 0 || arr[j] <= 0) {
                continue;
            }
            if(arr[i] < arr[j] && isPerfectSquare(arr[i], arr[j])) {
                count++;
            }
        }
    }
    return count;
}
    static boolean isPerfectSquare(int n, int m) {
        int num = n + m;
        for(int i = 1; i < num; i++) {
            if(i * i == num) {
                return true;
            }
        }
        return false;
    }
}  
