import java.util.*;

class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList(Arrays.asList(a, b, c));
                
        Set<Integer> set = new HashSet(list);
        int num = set.size();
        
        switch(num){
            case 3: answer = a+b+c; break;
            case 2: answer = (a+b+c)*((a*a)+(b*b)+(c*c)); break;
            case 1: answer = (a*3) * ((a*a)*3) * ((a*a*a)*3); break;
        }
        
        return answer;
    }
}