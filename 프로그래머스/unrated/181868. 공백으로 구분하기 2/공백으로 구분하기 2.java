import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        
        String a = my_string.replaceAll("\\s+", " ").trim();
        
        String[] answer = a.split(" ");
        
        return answer;
    }
}