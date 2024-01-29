import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int cnt = 0;
        int sum = 0;
        
        Arrays.sort(d);
        for(int i : d){
            if(sum + i > budget){
                break;
            }
            sum += i;
            cnt++;
        }
        
        return cnt;
    }
}