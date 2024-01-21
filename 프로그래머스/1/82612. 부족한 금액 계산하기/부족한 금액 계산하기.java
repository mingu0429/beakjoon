class Solution {
    public long solution(int price, int money, int count) {
        long answer = money;
        
        for(int i = 0; i < count; i++){
            answer = answer - (price + price * i);            
        }
        
        if(answer < 0){
            answer = -1 * answer;
        }else{
            answer = 0;
        }

        return answer;
    }
}