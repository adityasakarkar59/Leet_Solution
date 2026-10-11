class Solution {
    public int findKthPositive(int[] arr, int k) {
        int max = arr[arr.length - 1];
        int[] nums = new int[max];
        for (int i=0; i<max; i++) {
            nums[i] = i+1;
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (nums[i] == arr[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                count++;
                if (count == k) {
                    return nums[i];
                }
            }
        }
        return max + (k - count);
    }
}