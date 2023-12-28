import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        
        for(int i : num_list){
            if(num_list.length >= 11){
                answer  = Arrays.stream(num_list).sum();
            } else {
                answer *= i;
            }
        }
        
        return answer;
    }
}