import java.util.*;

class Solution {
    public ArrayList solution(String myString) {
        
        String[] answer = myString.split("x");
        ArrayList list = new ArrayList();
        
        for(String s : answer){
            if(!s.equals("")){
                list.add(s);
            }
        }
        Collections.sort(list);        
                
        return list;
    }
}