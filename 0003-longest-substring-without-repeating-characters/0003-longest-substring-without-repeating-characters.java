class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> bc = new HashSet<>();
        int count =0;
        int i=0;
        for(int j=0;j<s.length();j++){
            
            while(bc.contains(s.charAt(j))){
                bc.remove(s.charAt(i));
                i++;
            }
            bc.add(s.charAt(j));
            count = Math.max(count,j-i+1);

        }
        return count;
    }
}