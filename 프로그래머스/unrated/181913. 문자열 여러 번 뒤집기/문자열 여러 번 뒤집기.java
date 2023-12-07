import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        String[] arr = my_string.split("");
        
        for(int i=0; i<queries.length;i++){
            int a = queries[i][0];
            int b = queries[i][1];
            int num = (b-a)%2==0 ? (b-a)/2 : (b-a+1)/2 ;
            
            for(int j=0; j< num;j++){                
                String temp = arr[a+j];
                arr[a+j]=arr[b-j];
                arr[b-j]=temp;
            }
        }
        return String.join("",arr);
    }
}