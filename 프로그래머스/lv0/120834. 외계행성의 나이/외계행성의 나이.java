class Solution {
    public String solution(int age) {
        String answer = "";
        String word = Integer.toString(age);
        
        for(int i = 0; i < word.length(); i++){
            answer += (char)((int)word.charAt(i) + 49);
        }
        
        return answer;
    }
}