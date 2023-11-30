import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        
        List<String> list = new ArrayList<>();
        
        for(int i = 0; i < my_str.length(); i+=n){
            if(my_str.length() - 1 - i < n){
                list.add(my_str.substring(i, my_str.length()));
            }else{
                list.add(my_str.substring(i, i + n));
                
            }
        }
        
        String[] answer = list.toArray(new String[list.size()]);
        
        return answer;
    }
}