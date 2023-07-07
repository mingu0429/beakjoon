class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int n = s + overwrite_string.length() - 1;
        
        for(int i = 0; i < my_string.length(); i++){
            if((i >= s) && (i <= n)){
                answer = answer + overwrite_string.charAt(i - s);            
            }else{
                answer = answer + my_string.charAt(i);
            }
        }
        return answer;
    }
}