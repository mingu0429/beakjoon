class Solution {
    public int solution(int n) {
        int cnt = 1;
        int answer = 1;
        
        while(cnt <= n){
            while((answer % 3 == 0) || (Integer.toString(answer).contains("3"))){
                answer++;
            }
            answer++;
            cnt++;
        }
        return answer - 1;
    }
}