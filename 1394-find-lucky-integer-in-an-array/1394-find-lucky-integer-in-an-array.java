import java.util.*;
class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> bc = new HashMap<>();
        for(int i: arr){
            bc.put (i,bc.getOrDefault(i,0)+1);
        } 
        int res=-1;
        for (int key : bc.keySet()) {
            if (key==bc.get(key)) {
                res =Math.max(res, key);
            }
        }
        return res;
    }
}
