class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        Set<Integer> bc = new HashSet<>();
        for(int i : nums){
            bc.add(i);
        }
        for(int i=1;i<=n;i++){
            if(!bc.contains(i)){
                return i;
            }
        }
        return n+1;
    }
}