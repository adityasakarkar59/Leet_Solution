class Solution {
    public int[] sortArrayByParityII(int[] nums) {
       int ev =0;
       int od=1;
       while(ev < nums.length && od < nums.length){
        if(nums[ev]%2==0){
            ev+=2;
        }else if(nums[od]%2!=0){
            od+=2;
        
        }else{
            int temp = nums[ev];
            nums[ev] = nums[od];
            nums[od] = temp;
            ev+=2;
            od+=2;
        }
        }
        return nums;
    }
}
