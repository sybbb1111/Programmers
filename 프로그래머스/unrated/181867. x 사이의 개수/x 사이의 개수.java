import java.util.*;

class Solution {
    public ArrayList solution(String myString) {
      
        String[] arr = myString.split("x");
        
        ArrayList<Integer> list = new ArrayList();
        
        for(int i=0; i<arr.length;i++){
            list.add(arr[i].length());
        }
        if(myString.charAt(myString.length()-1)=='x'){
            list.add(0);
        }
        
        return list;
    }
}