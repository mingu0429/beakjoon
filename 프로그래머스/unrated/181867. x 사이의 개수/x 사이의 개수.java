class Solution {
    public int[] solution(String myString) {
        
        String[] arrStr = myString.split("x", -1);
        int[] answer = new int[arrStr.length];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = arrStr[i].length();
        }
        
        return answer;
    }
}