class Solution {
    public int firstUniqueEven(int[] nums) {
        int [] arr =  new int[101];
        for(int num:nums){
            arr[num]++;
        }
        for(int num:nums){
            if(num%2==0 && arr[num]==1){
                return num;
                
            }
        }
        return -1;
    }
}