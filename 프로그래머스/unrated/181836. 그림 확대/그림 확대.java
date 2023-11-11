import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        
        List<String> list = new ArrayList<>();
        String temp = "";
        
        for(int i = 0; i < picture.length; i++){
            temp = "";
            for(int j = 0; j < picture[i].length(); j++){
                for(int l = 0; l < k; l++){
                    temp += picture[i].charAt(j);
                }
            }
            for(int m = 0; m < k; m++){
                list.add(temp);                
            }
        }
        
        String[] answer = list.toArray(new String[list.size()]);
        return answer;
    }
}