class Solution {
    public String solution(String myString) {
        String answer = "";
        
        String[] arr = myString.split("");
        
        for (String str : arr) {
            if (str.equals("a")) {
                answer += "A";
            } else if (!str.equals("A") && Character.isUpperCase(str.charAt(0))) {
                answer += Character.toLowerCase(str.charAt(0));
            } else {
                answer += str;
            }
        }
        
        return answer;
    }
}