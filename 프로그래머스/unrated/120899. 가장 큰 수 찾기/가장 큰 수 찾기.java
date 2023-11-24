import java.util.Arrays;

class Solution {
    public int[] solution(int[] array) {
        
        int[] answer = new int[2];
        int max = Arrays.stream(array).max().getAsInt();
        int idx = 0;
        
        for(int i = 0; i < array.length; i++){
            if(array[i] == max){
                idx = i;
            }
        }
        
        answer[0] = max;
        answer[1] = idx;
        
        return answer;
    }
}