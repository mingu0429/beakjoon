class Solution {
    public int solution(int number, int limit, int power) {
        
        int answer = 0;
        int count = 0;
        
        for(int i = 0; i < number; i++){
            count = 0;
            for(int j = 1; j * j <= i + 1; j++){
                if(j * j == i + 1) count++;
                else if((i + 1) % j == 0) count += 2;
            }
            if(count > limit) answer += power;
            else answer += count;
        }
        
        
        return answer;
    }
}