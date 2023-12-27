class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String a = myString.toUpperCase();
        String b = pat.toUpperCase();
        
        answer = a.contains(b) ? 1 : 0;
        
        return answer;
    }
}