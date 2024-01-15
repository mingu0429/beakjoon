import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            list.add(arr[i]);
        }
        
        list.remove(Collections.min(list));
        
        if(list.size() == 0){
            list.add(-1);
        }
        
        int[] answer = list.stream()
            .mapToInt(i -> i)
            .toArray();
        
        return answer;
    }
}