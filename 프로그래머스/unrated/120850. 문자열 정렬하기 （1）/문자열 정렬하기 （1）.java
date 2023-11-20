import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String my_string) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++){
            if(((int)my_string.charAt(i) >= 48) && ((int)my_string.charAt(i) <= 57)){
                list.add((int)my_string.charAt(i) - 48);
            }
        }
        list.sort(Comparator.naturalOrder());
        
        int[] answer = list.stream()
            .mapToInt(i -> i)
            .toArray();
        
        return answer;
    }
}