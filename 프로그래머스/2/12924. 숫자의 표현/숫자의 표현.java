class Solution {
    public int solution(int n) {
        int answer = 1;
        int temp = 0;
        
        for(int i = 1; i < n; i++){
            temp = 0;
            for(int j = i; j < n; j++){
                temp += j;
                if(temp == n){
                    answer++;
                }else if(temp > n){
                    break;
                }
            }
        }
        return answer;
    }
}