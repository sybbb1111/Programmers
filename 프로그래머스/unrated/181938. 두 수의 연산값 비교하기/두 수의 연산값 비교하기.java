class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String ab = ""+a+b;
        int result = 2*a*b;
        
        return Math.max(Integer.parseInt(ab), result);
    }
}