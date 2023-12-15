class Solution {
    public int[] solution(int[][] score) {
        
        int[] sum = new int[score.length];
        int[] answer = new int[score.length];
        
        for(int i = 0; i < score.length; i++){
            sum[i] = score[i][0] + score[i][1];
        }
        
        for(int j = 0; j < score.length; j++){
            int idx = 1;
            for(int k = 0; k < score.length; k++){
                if(sum[j] < sum[k]){
                    idx++;
                }
                answer[j] = idx;
            }
        }
        
        return answer;
    }
}