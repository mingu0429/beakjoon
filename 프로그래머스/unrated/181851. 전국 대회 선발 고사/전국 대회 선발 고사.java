import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        
        int[][] answer = new int[rank.length][2];
        
        for(int i = 0; i < rank.length; i++){
            answer[i][0] = rank[i];
            answer[i][1] = i;
        }
        
        Arrays.sort(answer, (o1, o2) -> o1[0] - o2[0]);
        
        int[] temp = new int[3];
        int idx = 0;
        
        for(int j = 0; j < answer.length; j++){
            if(attendance[answer[j][1]]){
                temp[idx] = answer[j][1];
                idx++;
            }
            if(idx == 3) break;
        }
        
        return 10000 * temp[0] + 100 * temp[1] + temp[2];
    }
}