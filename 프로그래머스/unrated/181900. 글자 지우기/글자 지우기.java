import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        
        Arrays.sort(indices);        
        String[] arr = my_string.split("");       
        ArrayList<String> list = new ArrayList();
        
        for(String str : arr){
            list.add(str);
        }
                
        for(int i=0; i<indices.length;i++){
            list.remove(indices[i]-i);
        }
        
        return String.join("",list);
    }
}