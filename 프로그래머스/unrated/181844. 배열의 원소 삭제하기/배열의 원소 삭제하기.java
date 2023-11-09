import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        List<Integer> list = new ArrayList<>();
        list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        
        for(int i = 0; i < delete_list.length; i++){
            if(list.contains(delete_list[i])){
                list.remove(list.indexOf(delete_list[i]));
            }
        }
        
        int[] answer = list.stream()
            .mapToInt(i -> i)
            .toArray();
        
        return answer;
    }
}