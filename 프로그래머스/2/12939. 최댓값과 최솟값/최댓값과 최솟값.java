import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split(" ");
        int[] arr = new int[strArr.length];
        
        for(int i = 0; i < strArr.length; i++){
            arr[i] =  Integer.parseInt(strArr[i]);
        }
        
        Arrays.sort(arr);
        
        int min = arr[0];
        int max = arr[strArr.length - 1];
        
        answer = min + " " + max;
        
        return answer;
    }
}