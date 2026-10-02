class Solution {
    public int minimumSwaps(int[] nums) {
        int k =0;
        for(int num : nums){
            if(num!=0) k++;
        }
        int swap = 0;
        for(int i=0;i<k;i++){
            if(nums[i]==0){
                swap++;
            }
        }
        return swap;
    }
}