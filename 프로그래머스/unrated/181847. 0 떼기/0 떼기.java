import java.util.*;

class Solution {
    public String solution(String n_str) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        String[] arr = n_str.split("");
        ArrayList list = new ArrayList(Arrays.asList(arr));

        while(list.get(0).equals("0")){
            list.remove(0);
        }
        for(int i=0; i<list.size(); i++){
            sb.append(list.get(i));
        }
                
        return sb.toString();
    }
}