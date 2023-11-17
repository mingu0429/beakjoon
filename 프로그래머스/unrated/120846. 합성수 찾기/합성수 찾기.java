class Solution {
    public int solution(int n) {
        
        int cnt = 0;
        int idx = 0;
        
        for(int i = 1; i <= n; i++){
            idx = 0;
            
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    idx++;
                }
            }
            
            if(idx >= 3){
                cnt++;
            }            
        }
        return cnt;
    }
}