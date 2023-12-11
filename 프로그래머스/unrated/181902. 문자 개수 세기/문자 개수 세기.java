import java.util.*;

class Solution {
    public ArrayList solution(String my_string) {
        
        char[] arr = my_string.toCharArray();      
        ArrayList list = new ArrayList();
        
        for(int i=0;i<arr.length;i++){
            list.add((int)arr[i]);
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