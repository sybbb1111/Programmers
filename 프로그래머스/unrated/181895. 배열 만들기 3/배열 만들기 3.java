import java.util.*;

class Solution {
    public ArrayList solution(int[] arr, int[][] intervals) {        
        ArrayList<Integer> list = new ArrayList();
        
        for(int i=0;i<2;i++){
            for(int j=intervals[i][0]; j<=intervals[i][1];j++){
                list.add(arr[j]);
            }
        }
        return list;
    }
}