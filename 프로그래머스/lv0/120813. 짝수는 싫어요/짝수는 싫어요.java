class Solution {
    public int[] solution(int n) {
        
        int arrLength = 0;
        
        if(n % 2 == 0){
            arrLength = n / 2;
        }else{
            arrLength = (n + 1) / 2;
        }
        
        int[] arr = new int[arrLength];
        
        for(int i = 0; i < arrLength; i++){
            arr[i] = 2 * i + 1;
        }
        return arr;
    }
}