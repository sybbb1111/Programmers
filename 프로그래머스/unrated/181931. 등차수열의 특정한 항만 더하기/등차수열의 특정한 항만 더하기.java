import java.util.*;

class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int num = included.length;
        int[] arr = new int[num];
        
        int c=0;
        for(int i=0; i<num; i++){
            arr[i] = a +(d*c);
            c++;
            
            if(included[i]){
                answer += arr[i];
            }
        }        
        
        return answer;
    }
}