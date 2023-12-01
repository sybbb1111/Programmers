import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i=0; i<queries.length; i++){
            int a =queries[i][0];
            int b = queries[i][1];
            
            ArrayList<Integer> list = new ArrayList();
            
            for(int j=a; j<=b; j++){
                if(arr[j] > queries[i][2]){ 
                    list.add(arr[j]);
                }
            }    
            answer[i] = !list.isEmpty() ? Collections.min(list) : -1;
        }
        return answer;
    }
}