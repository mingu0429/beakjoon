class Solution {
    public int solution(String s) {
        
        char c = s.charAt(0);
        int answer = 0;
        int first = 0;
        int other = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(first == other){
                answer++;
                c = s.charAt(i);
            }
            if(s.charAt(i) == c){
                first++;
            }else{
                other++;
            }
        }
        
        return answer;
    }
}