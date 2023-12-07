import java.util.*;

class Solution {
    public ArrayList solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList();
        
        for(int i=0; i<intStrs.length;i++){
            int a = Integer.parseInt(intStrs[i].substring(s, s+l));
            if(a>k){
                list.add(a);
            }
        }        
        return list;
        
    }
}