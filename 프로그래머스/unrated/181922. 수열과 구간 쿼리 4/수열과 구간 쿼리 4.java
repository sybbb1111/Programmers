import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int size = queries.length;
        int[] answer = Arrays.copyOf(arr, arr.length);
        
        for(int i=0; i<size; i++){
            int a = queries[i][0];
            int b = queries[i][1];
                        
            for(int j=a; j<=b ;j++){
                if( j%queries[i][2] == 0){
                    answer[j]++;
                }
            }
        }
        return answer;
    }
}