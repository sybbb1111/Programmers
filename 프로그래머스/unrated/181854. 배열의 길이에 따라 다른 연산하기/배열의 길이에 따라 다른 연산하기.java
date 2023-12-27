class Solution {
    public int[] solution(int[] arr, int n) {
        int num = arr.length;
        
        for(int i=0; i<num;i+=2){
            if(num%2 != 0){
                arr[i] += n;
            } else {
                arr[i+1] += n;
            }
        }
        
        return arr;
    }
}