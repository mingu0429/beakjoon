class Solution {
    public String solution(int[] food) {
        String answer = "";
        String str = "";
        
        for(int i = 1; i < food.length; i++){
            for(int j = 0; j < food[i] / 2; j++){
                answer += i;
            }
        }
        answer += 0;
        for(int k = answer.length() - 2; k >= 0; k--){
            str += answer.charAt(k);
        }
        
        answer += str;
        return answer;
    }
}