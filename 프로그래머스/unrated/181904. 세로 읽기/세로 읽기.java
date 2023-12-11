import java.util.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String[] arr = my_string.split("");
                        
        for(int i=0; i<arr.length/m;i++){
            answer += arr[(c-1) + (m*i)];
        }
        
        return answer;
    }
}