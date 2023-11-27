import java.util.*;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        
        ArrayList<String> list = new ArrayList();
        
        for(int i=0; i<my_string.length(); i++){
            list.add(my_string.substring(i));
        }
        
        if(list.contains(is_suffix)){
            answer = 1;
        }
        
           //  String[] arr = new String[my_string.length()];
           // for(int i=0; i<my_string.length(); i++){
           //     arr[i] = my_string.substring(i);
           // }
           // boolean q = Arrays.stream(arr).anyMatch(is_suffix::equals);
           //  if(q){ answer = 1;}

        
        return answer;
    }
}