import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        ArrayList<Integer> list = new ArrayList();
        list.add(n);
        
        while(n > 1){
            if(n%2==0){
                n /= 2;
            } else {
                n= (n*3)+1;
            }
            list.add(n);
            if(n==1){
                break;
            }
        }
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        
        
        return answer;
    }
}