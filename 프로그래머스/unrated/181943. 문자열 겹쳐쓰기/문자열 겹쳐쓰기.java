class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        int overStr = overwrite_string.length();
        String re = my_string.substring(s, s+overStr);
        
        String a = my_string.substring(0, s);
        String last = my_string.substring(s+overStr);
        
        answer = a+overwrite_string+last;
        System.out.println(answer);
        
        return answer;
    }
}