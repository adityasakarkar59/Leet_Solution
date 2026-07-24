class Solution {
    public String reverseOnlyLetters(String s) {
        
        String str ="";
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                str+=s.charAt(i);
            }
        }
       String res="";
       int j=str.length()-1;
       for(int i=0;i<s.length();i++){
       if(Character.isLetter(s.charAt(i))){
        res+=str.charAt(j);
        j--;
        }else{
            res+=s.charAt(i);
        }
       }
       return res;
    }
}