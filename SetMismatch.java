class Solution {
    public int[] findErrorNums(int[] nums) {
        int dup = -1;
        int miss = -1;
        for(int i = 1; i <= nums.length; i++) {
            int count = 0;
            for(int j = 0; j < nums.length; j++) {
                if(nums[j] == i) {
                    count++;
                }
            }
            if(count == 2) {
                dup = i;
            }else if(count == 0) {
                miss = i;
            }
        }
        return new int[] {dup, miss};
    }
}
