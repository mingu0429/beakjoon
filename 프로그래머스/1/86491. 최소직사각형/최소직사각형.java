import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        
        int w = 0;
        int h = 0;
        
        for(int[] i : sizes){
            Arrays.sort(i);
        }
        
        for(int j = 0; j < sizes.length; j++){
            if(sizes[j][0] > w){
                w = sizes[j][0];
            }
            if(sizes[j][1] > h){
                h = sizes[j][1];
            }
        }
        
        return w * h;
    }
}