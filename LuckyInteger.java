class Solution {
    public int findLucky(int[] arr) {
        int[] freq = new int [501];
        for(int num : arr) {
            freq[num]++;
        }
        int maxLucky = -1;
        for(int i = 1; i <= 500; i++) {
            if(freq[i] == i) {
                maxLucky = Math.max(maxLucky, i);
            }
        }
        return maxLucky;
    }
}
