import java.util.*;

class Solution {
    public String[] solution(String myStr) {

        myStr = myStr.replace("a", " ");
        myStr = myStr.replace("b", " ");
        myStr = myStr.replace("c", " ");        
        myStr = myStr.trim();
        
        if(myStr.equals("")){
            myStr = "EMPTY";
        }
        
        String[] answer = myStr.trim().split("\\s+");
   
        return answer;
    }
}