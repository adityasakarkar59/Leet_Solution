public class Solution {
    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";

        String prev = strs[0];
        for(int i=1;i<strs.length;i++){
            while(!strs[i].startsWith(prev)){
                prev = prev.substring(0,prev.length()-1);
                if(prev.isEmpty()) return "";
            }
        }
        return prev;
    }

}