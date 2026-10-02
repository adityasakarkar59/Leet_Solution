class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int Idx = i + 1;    
            int revPos = 26 - (ch - 'a');
         sum += Idx * revPos;
        }
        
        return sum;
    }
}