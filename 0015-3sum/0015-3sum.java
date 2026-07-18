class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n =  nums.length;
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int L=i+1;
            int R=n-1;
            while(L<R){
                int sum = nums[i] + nums[L]+nums[R];
                if(sum == 0){
                    res.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    L++;
                    R--;
                    while( L<R && nums[L]==nums[L-1])
                    L++;
                    while( L<R && nums[R]==nums[R+1])
                    R--;
                }else if(sum < 0){
                    L++;
                }else{
                    R--;
                }
            }
        }
        return res;
    }
}