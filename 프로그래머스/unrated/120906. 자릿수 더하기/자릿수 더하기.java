class Solution {
    public int solution(int n) {
        
        int answer = n % 10;
        
        while(n > 0){
            n /= 10;
            answer += (n % 10);
        }
        
        return answer;
    }
}