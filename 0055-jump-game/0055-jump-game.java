class Solution {
    public boolean canJump(int[] nums) {
        int cur = 0;         
        for (int i = 0; i < nums.length; i++) {
         if (i > cur) {
                return false;
            }
            cur = Math.max(cur, i + nums[i]);
            if (cur >= nums.length - 1) {
                return true;
            }
        }
    return true;
    }
}