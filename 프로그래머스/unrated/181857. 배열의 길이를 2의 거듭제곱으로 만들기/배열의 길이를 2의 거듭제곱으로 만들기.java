import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
                
        int l = arr.length;

        int p =0;
        for(int i=0;i<=10;i++){
            p = (int)Math.pow(2, i);
            if(l<=p){
                break;
            } 
        }
        
        int[] result = new int[p];
        for(int i=0;i<arr.length;i++){
            result[i] = arr[i];
        }
        
        return result;
    }
}