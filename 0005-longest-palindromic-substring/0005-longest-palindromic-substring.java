class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String large="";
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int left=i;
                int right=j;
                while(left<right && s.charAt(left)==s.charAt(right)){
                    left++;
                    right--;
                }
                if(left >= right){
                    if(j-i+1>large.length()){
                        large = s.substring(i,j+1);
                    }

                }
            }
        }
        return large;
    }
}