import java.util.Arrays;

class Solution {
    public String solution(String s) {
        
        String answer = "";
        
        for(int i = 0; i < s.length(); i++){
            if((i == s.lastIndexOf(s.charAt(i)) && (i == s.indexOf(s.charAt(i))))){
                answer += s.charAt(i);
            }
        }
        
        char[] arr = answer.toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);

    }
}