import java.util.*;

class Solution {
    public ArrayList solution(int[] arr, int[] delete_list) {        
        
        ArrayList dlist = new ArrayList();
        ArrayList rlist = new ArrayList();
        for(int i : delete_list){
            dlist.add(i);
        }
        
        for(int i=0;i<arr.length;i++){
            if(!dlist.contains(arr[i])){
                rlist.add(arr[i]);
            }
        }        
        return rlist;  
    }
}