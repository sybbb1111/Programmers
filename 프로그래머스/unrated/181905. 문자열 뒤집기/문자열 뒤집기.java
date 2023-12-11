import java.util.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        
        String[] arr = my_string.split("");
        int num = e-s+1;
        
        for(int i=0; i<num/2; i++){
            String temp="";
            temp = arr[s+i];
            arr[s+i] =arr[e-i];
            arr[e-i]=temp;
        }
        return String.join("",arr);
    }
}