class Solution {
    public int isMadhavArray(int[] arr) {
        int n = (int) Math.sqrt(2 * a.length);
        if (n * (n + 1) / 2 != a.length) {
            return 0; 
        }
        int sum = a[0];
        int i = 1;
        for(int k = 2; k <= n; k++) {
            int groupSum = 0;
            for(int j = 0; j < k; j++) {
                groupSum += a[i];
                i++;
            }
            if(groupSum != sum) return 0;
        }
        return 1;
    }
}
