class Solution {
    public String solution(String myString, String pat) {        
        int a = myString.lastIndexOf(pat);
        
        return myString.substring(0,a+pat.length());
    }
}