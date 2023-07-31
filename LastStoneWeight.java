class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length-1;
        while(n >= 1) {
            Arrays.sort(stones);
            int result = stones[n] - stones[n-1];
            stones[n-1] = result;
            n--;
        }
        return stones[0];
    }
}
