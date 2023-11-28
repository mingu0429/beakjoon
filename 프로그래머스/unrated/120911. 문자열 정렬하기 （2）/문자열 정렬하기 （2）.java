import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        
        my_string = my_string.toLowerCase();
        String[] strArr = my_string.split("");
        
        Arrays.sort(strArr);
        
        String answer = "";
        
        for(int i = 0; i < strArr.length; i++){
            answer += strArr[i];
        }
        return answer;
    }
}