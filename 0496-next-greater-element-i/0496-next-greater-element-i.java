import java.util.*;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer , Integer> bc = new HashMap<>();
        Stack<Integer> bcc = new Stack<>();

        for(int i=nums2.length-1;i>=0;i--){
            while(!bcc.isEmpty() && bcc.peek()<= nums2[i]){
                bcc.pop();
            }
            if(bcc.isEmpty()){
                bc.put(nums2[i],-1);
            }else{
                bc.put(nums2[i],bcc.peek());
            }
            bcc.push(nums2[i]);
        }
        int ans[] = new int[nums1.length];
        for(int i = 0;i<nums1.length;i++){
            ans[i] = bc.get(nums1[i]);
        }
        
        return ans;
    }
}