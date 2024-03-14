import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        int[] answer = new int[2];
        map.put(words[0], 1);
        
        for(int i = 1; i < words.length; i++){
            if(!map.containsKey(words[i]) && words[i - 1].charAt(words[i - 1].length() - 1) == words[i].charAt(0)){
                map.put(words[i], i % n + 1);
            }else{
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
        }
        return answer;
    }
}