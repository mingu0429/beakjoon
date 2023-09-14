class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[][] dice = new int[6][1];
        int count = 0;
        
        dice[a - 1][0]++;
        dice[b - 1][0]++;
        dice[c - 1][0]++;
        dice[d - 1][0]++;
        
        for(int i = 0; i < 6; i++){
            if(dice[i][0] == 1){
                count++;
            }
        }
        if(count == 4){
            for(int i = 0; i < 6; i++){
                if(dice[i][0] == 1){
                    return i + 1;
                }
            }
        }
        
        for(int i = 0; i < 6; i++){
            if(dice[i][0] == 4){
                answer = (i + 1) * 1111;
            }else if(dice[i][0] == 3){
                for(int j = 0; j < 6; j++){
                    if(dice[j][0] == 1){
                        answer = (10 * (i + 1) + (j + 1)) * (10 * (i + 1) + (j + 1)); 
                    }
                }
            }else if(dice[i][0] == 2){
                for(int j = i + 1; j < 6; j++){
                    if(dice[j][0] == 2){
                        answer = (i + 1 + j + 1) * (j - i);
                    }
                }
                for(int j = 0; j < 6; j++){
                    if(dice[j][0] == 1){
                        for(int k = j + 1; k < 6; k++){
                            if(dice[k][0] == 1){
                                answer = (j + 1) * (k + 1);
                            }
                        }
                    }
                }
            }
        }
        
        return answer;
    }
}