import java.util.*;

class Solution {
    public int solution(int[] citations) {
        
        int h = 0;
        Arrays.sort(citations);
        if(citations[citations.length - 1] == 0){
            return 0;
        }
    
        
        for(int i = 0; i < citations.length; i++){
            h = citations.length - i;
            if(citations[i] >= h){
                break;
            }
        }
        
        return h;
    }
}