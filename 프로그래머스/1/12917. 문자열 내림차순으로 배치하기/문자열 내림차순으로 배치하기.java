import java.util.*;

class Solution {
    public String solution(String s) {
               
        String answer = "";
        String[] arr = s.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        
        for(String n : arr){
            answer += n;
        }
        return answer;
    }
}