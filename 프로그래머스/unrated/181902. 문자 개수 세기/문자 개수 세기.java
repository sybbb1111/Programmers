import java.util.*;

class Solution {
    public ArrayList solution(String my_string) {
        
        ArrayList list = new ArrayList();
        for(int i=0;i<my_string.length();i++){
            list.add((int)my_string.charAt(i));
        }
        
        ArrayList result = new ArrayList();
                
        for(int i=0; i<26;i++){
            int a = Collections.frequency(list, 65+i);
            result.add(a);
        }
        for(int i=0; i<26;i++){
            int a = Collections.frequency(list, 97+i);
            result.add(a);
        }
        
        return result;
    }
}