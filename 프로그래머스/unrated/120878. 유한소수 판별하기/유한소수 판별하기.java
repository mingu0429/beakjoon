class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        
        int num = b / GCD(a, b);
        
        while(num != 1){
            if(num % 2 == 0){
                num /= 2;
            }else if(num % 5 == 0){
                num /= 5;
            }else{
                answer = 2;
                break;
            }
        }
        return answer;
    }
    
    public int GCD(int a, int b){
        if(b == 0){
            return a;
        }else{
            return GCD(b, a % b);
        }
    }
}