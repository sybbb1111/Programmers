class Solution {
    public String solution(String myString) {
        String answer = "";
        
        char a = 'l';
        int b = (int)a;
               
        for(int i=0; i<myString.length();i++){
            if((int)myString.charAt(i)<b){
                answer += a;
            } else {
                answer += myString.charAt(i);
            }
        }
        
        return answer;
    }
}