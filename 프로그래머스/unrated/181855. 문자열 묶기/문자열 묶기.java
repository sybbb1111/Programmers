import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        
        ArrayList<Integer> list = new ArrayList();
        ArrayList<Integer> list2 = new ArrayList();
        
        for(int i=0; i<strArr.length;i++){
            list.add(strArr[i].length());
        }
        int num = Collections.max(list);
        
        for(int i=0; i<=num;i++){
            list2.add(Collections.frequency(list, i));
        }
        answer = Collections.max(list2);

        return answer;
    }
}