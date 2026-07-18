class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int close = nums[0]+nums[1]+nums[2];

        for(int i=0;i<n-2;i++){
            if(i > 0 && nums[i]==nums[i-1]) continue;
           int L = i+1;
           int R = n-1;
           while(L<R){
           int sum = nums[i] + nums[L] + nums[R];
            if(Math.abs(sum-target)<Math.abs(close-target))
            close = sum;
            if(sum < target){
                L++;
            }else if(sum > target){
                R--;
            }else{
                return sum;
            }

           }

        }
        return close;
        
    }
}