class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length() < 8) return false;
        boolean hasLow = false;
        boolean hasUp = false;
        boolean di = false;
        boolean spe = false;
        String speChar= "!@#$%^&*()-+";
        
    
    for(int i =0;i<password.length();i++){
        char ch = password.charAt(i);
        if(i>0 && ch == password.charAt(i-1)){ return false;
        }
        if(Character.isLowerCase(ch))hasLow = true;
        else if(Character.isUpperCase(ch))hasUp = true;
        else if(Character.isDigit(ch))di = true;
        else if(speChar.indexOf(ch) != -1)spe = true;
    }
    return hasLow && hasUp && di && spe;
}
}