import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> list = new ArrayList<>();
        
       for(int i = 0; i < arr.length; i++){
           if(arr[i] == 2){
               list.add(i);
           }
        }
        
        if(list.size() == 0) {
            return new int[] {-1};
        }
        
        int start = list.get(0);
        int last = list.get(list.size() - 1);
        
        int[] answer = Arrays.copyOfRange(arr, start, last + 1);
        
        return answer;
        
       }
}