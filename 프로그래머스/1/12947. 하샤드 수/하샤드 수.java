class Solution {
    public boolean solution(int x) {
        
        boolean answer = false;
        int sum = 0;
        int x2 = x;
        
        while(x2 > 0){
            sum += x2 % 10;
            x2 /= 10;
        }
        
        if(x % sum == 0){
            answer = true;
        }
        
        return answer;
    }
}