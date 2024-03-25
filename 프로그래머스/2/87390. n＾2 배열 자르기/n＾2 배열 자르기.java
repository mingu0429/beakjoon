import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        
        List<Integer> list = new ArrayList<>();
        
        for(long i = left; i < right + 1; i++){
            list.add((int)(Math.max(i / n, i % n) + 1));
        }
        
        int[] answer = list.stream()
            .mapToInt(i -> i)
            .toArray();
        
        return answer;
    }
}