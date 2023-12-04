import java.util.*;
import java.util.Arrays;
import java.util.stream.*;

class Solution {
    public ArrayList<Integer> solution(int l, int r) {
        int[] answer = IntStream.rangeClosed(l, r).toArray();
        ArrayList<Integer> list = new ArrayList();
        
        int a = 0;
        for(int num : answer){
            String str = Integer.toString(num);
            String str2 = "";
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i)=='5' || str.charAt(i)=='0'){
                    str2 += str.charAt(i);
                } else {
                    str2 = "-1";
                    break;
                }
            }
            if(!str2.equals("-1")){
                list.add(Integer.parseInt(str2));
            }
        }
        if(list.isEmpty()){
            list.add(-1);
        }
        System.out.println(list);

        return list;
    }
}