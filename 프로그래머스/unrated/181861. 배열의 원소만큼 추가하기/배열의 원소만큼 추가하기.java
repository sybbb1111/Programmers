import java.util.*;

class Solution {
    public ArrayList solution(int[] arr) {
        
        ArrayList<Integer> list = new ArrayList();
        for(int i : arr){
            for(int j=0;j<i;j++){
                list.add(i);
            }
        }        
        return list;
    }
}