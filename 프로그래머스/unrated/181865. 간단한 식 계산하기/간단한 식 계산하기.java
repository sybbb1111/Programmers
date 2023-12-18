class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        String[] arr = binomial.split(" ");

        for(int i=0;i<arr.length;i++){
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[2]);
            
            switch(arr[i]){
                case "+": answer = a+b; break;
                case "-": answer = a-b; break;
                case "*": answer = a*b; break;
            }
            
            // if(arr[1].equals("+")){
            //     answer = a+b;
            // } else if(arr[1].equals("-")){
            //     answer = a-b;
            // } else if(arr[1].equals("*")){
            //     answer = a*b;
            // }
        }
        
        return answer;
    }
}