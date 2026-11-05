class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String str1 = s+s;
        String str = str1.substring(1,str1.length()-1);
        return str.contains(s);
    }
}