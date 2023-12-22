class Solution {
    public int solution(String A, String B) {
        
        int answer = 0;
        String str = A;
        String temp = "";
        
        for(int i = 0; i < str.length(); i++){
            if(str.equals(B)){
                return answer;
            }
            temp = str.substring(str.length() - 1);
            str = temp + str.substring(0, str.length() - 1);
            answer++;
        }
        
        return -1;
    }
}