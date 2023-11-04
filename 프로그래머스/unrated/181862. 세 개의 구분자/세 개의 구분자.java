import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replaceAll("a", " ");
        myStr = myStr.replaceAll("b", " ");
        myStr = myStr.replaceAll("c", " ");
        
        List<String> list = new ArrayList<>(Arrays.asList(myStr.split(" ")));
        
        list.removeAll(Arrays.asList(""));
        
        if(list.size() == 0){
            list.add("EMPTY");
        }
        
        String[] answer = list.toArray(new String[list.size()]);
        
        return answer;
    }
}