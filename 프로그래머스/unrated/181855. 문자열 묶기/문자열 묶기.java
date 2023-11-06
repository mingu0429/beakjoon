import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int[] answer = new int[30];
        
        for(String str : strArr) answer[str.length() - 1]++;
        
        return Arrays.stream(answer).max().getAsInt();
    }
}