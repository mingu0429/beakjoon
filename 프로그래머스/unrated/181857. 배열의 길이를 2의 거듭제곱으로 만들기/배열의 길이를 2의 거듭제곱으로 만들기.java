class Solution {
    public int[] solution(int[] arr) {
        
        int i = 0;
        double num = Math.pow(2,i);
        
        while(arr.length > num){
            i++;
            num = Math.pow(2,i);
        }
        
        int[] answer = new int[(int)num];
        
        for(int j = 0; j < arr.length; j++){
            answer[j] = arr[j];
        }
        
        return answer;
    }
}