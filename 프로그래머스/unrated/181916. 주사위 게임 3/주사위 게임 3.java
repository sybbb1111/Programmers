import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);        
        Collections.sort(list);
        Set<Integer> set = new HashSet<Integer>(list);
        
        if(set.size()==1){
            answer = 1111 * a;
        } else if(set.size()==2){
            if(Collections.frequency(list, a)==1){
                list.remove(Integer.valueOf(a));
                answer = (int) Math.pow(( 10 * list.get(0) + a), 2);
            } else if(Collections.frequency(list, a)==3){
                list.remove(Integer.valueOf(a));
                list.remove(Integer.valueOf(a));
                list.remove(Integer.valueOf(a));
                answer = (int) Math.pow(( 10 * a + list.get(0)), 2);
            } else if(Collections.frequency(list, a)==2){
                list.remove(Integer.valueOf(a));
                list.remove(Integer.valueOf(a));
                answer = ( a + list.get(0)) * Math.abs(a-list.get(0));
            }
            
        } else if(set.size()==3){            
            answer = 1;
            for(int i : list){
                if(Collections.frequency(list, i)==1){
                    answer *= i;
                }
            }
        } else if(set.size()==4){
            answer = Collections.min(set);
        }     
        return answer;
    }
}