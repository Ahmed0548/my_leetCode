// ################### frst solution ################### //
class Solution {
    public int poe(int[] nums) {
int rightSum = 0;
        int leftSum = 0;
        for(int i =0; i < arr.length; i++) {
            rightSum += arr[i];
        }
        for(int i =0; i < arr.length; i++) {
            rightSum -= arr[i];
            if(leftSum == rightSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
}
// ################### second solution ################### //
class Solution {
    public int poe(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum+= nums[i];
        }
        int leftSum = 0;
        for(int i = 0; i < nums.length; i++) {
            if(leftSum == sum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
