import java.util.*;


class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList();
        for(int i: arr){
            list.add(i);
        }
        
        ArrayList<Integer> result = new ArrayList();
        
        if(list.contains(2)){
            int a = list.indexOf(2);
            int b = list.lastIndexOf(2);    
            
            for(int i=a;i<=b;i++){
                result.add(list.get(i));
            }
        } else {
            result.add(-1);
        }       
        
        return result.stream().mapToInt(i->i).toArray();
    }
}