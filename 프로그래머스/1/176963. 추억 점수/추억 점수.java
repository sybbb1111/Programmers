import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        ArrayList<String> list = new ArrayList();
        
        for(int i=0;i<name.length;i++){
            list.add(name[i]);
        }
        System.out.println(list);
        
        for(int i=0;i<photo.length;i++){
                int re = 0;
            for(int j=0;j<photo[i].length;j++){
                if(list.contains(photo[i][j])){
                    re += yearning[list.indexOf(photo[i][j])];
                }
            }
            answer[i] = re;
        }
        return answer;
    }
}