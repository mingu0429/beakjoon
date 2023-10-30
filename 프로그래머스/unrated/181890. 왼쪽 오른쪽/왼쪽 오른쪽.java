import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        
        String[] arr = {};
        
        for(int i = 0; i < str_list.length; i++){
            
            if(str_list[i].equals("l")){ //i번째 l 만남
                
                arr = Arrays.copyOfRange(str_list, 0, i);
                
                return arr;
                
            } else if(str_list[i].equals("r")){
                
                arr = Arrays.copyOfRange(str_list, i + 1, str_list.length);
                
                return arr;
                
            }
            
        }
        
        return arr;
    }
}