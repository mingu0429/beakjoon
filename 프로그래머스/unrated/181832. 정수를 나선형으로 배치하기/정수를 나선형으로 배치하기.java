class Solution {
    public int[][] solution(int n) {
        
        int[][] answer = new int[n][n];
        int x_end = n - 1;
        int y_end = n - 1;
        int x_start = 0;
        int y_start = 0;
        int num = 1;
        
        
        while(num <= n * n){
                        
            // 오른쪽 방향
            for(int i = x_start; i <= x_end; i++){
                answer[y_start][i] = num++;
            } y_start++;
            
            // 아래쪽 방향
            for(int i = y_start; i <= y_end; i++){
                answer[i][x_end] = num++;
            } x_end--;
            
            // 왼쪽 방향
            for(int i = x_end; i >= x_start; i--){
                answer[y_end][i] = num++;
            } y_end--;
            
            // 위쪽 방향
            for(int i = y_end; i >= y_start; i--){
                answer[i][x_start] = num++;
            } x_start++;
        }
        
        return answer;
    }
}