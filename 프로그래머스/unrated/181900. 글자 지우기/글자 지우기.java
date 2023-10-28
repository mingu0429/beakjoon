import java.util.*;
import java.lang.StringBuilder;

class Solution {
    public String solution(String my_string, int[] indices) {
        
        StringBuilder sb = new StringBuilder(my_string);
        
        int count = 0;
        
        Arrays.sort(indices);
        
        for(int i = 0; i < indices.length; i++){ // 0 ~ 7
            sb.deleteCharAt(indices[i] - count);
            count++;
        }
        
        String answer = sb.toString();
        
        return answer;
    }
}