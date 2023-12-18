class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        int f = myString.indexOf(pat.charAt(0));
        
        if (f == -1) {
            return 0;
        }
        
        for(int i=f;i<myString.length()-pat.length()+1;i++){
            if( myString.charAt(i)==pat.charAt(0) 
               && myString.substring(i, i+pat.length()).equals(pat) ){
                answer ++;
            }
        }
        return answer;
    }
}