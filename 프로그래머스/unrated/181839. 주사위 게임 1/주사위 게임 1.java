class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        if(a%2==1&&b%2==1){
            answer = (a*a) + (b*b);
        } else if(a%2==1||b%2==1){
            answer = 2 * (a+b);
        } else {
            answer = (a-b > 0 ? a-b : -(a-b)); 
        }
        
        return answer;
    }
}