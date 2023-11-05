import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        
        arr = Arrays.stream(arr).distinct().toArray(); //중복 제거
        
        if(arr.length >= k){
            for(int i = 0; i < k; i++){
                answer[i] = arr[i];
            }
        }else{
            for(int i = 0; i < arr.length; i++){
                answer[i] = arr[i];
            }
        }
        
        return answer;
    }
}