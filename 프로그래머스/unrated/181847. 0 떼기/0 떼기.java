class Solution {
    public String solution(String n_str) {
        
        int idx = 0;
        String answer = "";
        
        for(int i = 0; i < n_str.length(); i++){
            if(n_str.charAt(i) != '0'){
                idx = i;
                break;
            }
        }
        
        for(int j = idx; j < n_str.length(); j++){
            answer += n_str.charAt(j);
        }
        
        return answer;
    }
}