class Solution {
    public String replaceDigits(String s) {
        String res = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)){
                res+=ch;
            }else{
                int shift = ch -'0';
                char n = (char)(res.charAt(res.length()-1)+shift);
                res+=n;
            }
        }
        return res;
    }
}