import java.util.*;

class Solution {
    public String[] solution(String myString) {
        
        List<String> list = new ArrayList<>(Arrays.asList(myString.split("x")));
        
        list.removeAll(Arrays.asList(""));
            
        list.sort(null);
        
        String[] answer = list.toArray(new String[list.size()]);
        
        return answer;
    }
}