import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = my_string.trim().split(" ", 0);
        List<String> list = new ArrayList<>();
        for(String str : answer) if(!str.equals("")) list.add(str);
        return list.toArray(new String[list.size()]);
    }
}